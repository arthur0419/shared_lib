def call(Closure callable) {
        // script {
        //     def debug = true
        //     echo 'Cambricon Config:'
        //     config.each{
        //         println(it.key + " : " + it.value)
        //         // echo it.key + " : " + it.value
        //     }
        //     if (config.debug) {
        //         debug = config.debug
        //     }
        //     echo "${debug}"
        //     echo "${config.debug}"
        //     echo 'do somthing in Cambricon'
        // }

        // pipeline {
        //     agent any
        //     stages {
        //         stage('build') {
        //             steps {
        //                 echo "doing cambricon build"
        //             }
        //         }
        //         stage('test') {
        //             when {
        //                 expression {return config.test}
        //             }
        //             steps {
        //                 echo "doing cambricon test"
        //             }
        //         }
        //     }
        // }

        def config = [:]
        callable.resolveStrategy = Closure.DELEGATE_FIRST;
        callable.delegate = config;
        callable.call()

        def build = null

        if (config.build) {
            build = [:]
            config.build.resolveStrategy = Closure.DELEGATE_FIRST
            config.build.delegate = build
            config.build()
        }
        def test = null
        if (config.test) {
            test = [:]
            config.test.resolveStrategy = Closure.DELEGATE_FIRST
            config.test.delegate = test
            config.test()
        }

        node {
            stage('prepare') {
                echo 'doing prepare'
                println("Cambricon Config:");
                config.each {
                    println(it.key + " : " + it.value)
                }
            }
            
            if (build) {
                stage('build') {
                    if (build.debug) {
                        echo 'doing build debug version'
                    } else {
                        echo 'doing build release version'
                    }

                    println("Build Config:");
                    build.each {
                        println(it.key + " : " + it.value)
                    }
                }
            }
            
            if (test) {
                stage('test') {
                    // echo 'doing test'
                    // println("Test Config:");
                    // test.each {
                    //     println(it.key + " : " + it.value)
                    // }

                    def count = 0
                    if (test.caffe) {
                        count++
                    }
                    if (test.tensorflow) {
                        count++
                    }
                    if (count == 1) {
                        if (test.caffe) {
                            stage('caffe') {
                                echo 'doing caffe test'
                            }
                        }
                        if (test.tensorflow) {
                            stage('tensorflow') {
                                echo 'doing tensorflow test'
                            }
                        }
                    } 

                    if (count == 2) {
                        def buildStages = [:]
                        buildStages.put('caffe', {
                            stage('caffe') {
                                stage('caffe_build') {
                                    echo 'doing caffe build'
                                }
                                stage('caffe_test') {
                                    echo 'doing caffe test'
                                }
                            }
                        })
                        buildStages.put('tensorflow', {
                            stage('tensorflow') {
                                stage('tensorflow_build') {
                                    echo 'doing tensorflow build'
                                }
                                stage('tensorflow_test') {
                                    echo 'doing tensorflow test'
                                }
                            }
                        })

                        parallel(buildStages)
                    }

                    // parallel {
                    //     stage('caffe') {
                    //         echo 'doing caffe test'
                    //     }
                    //     stage('tensorflow') {
                    //         echo 'doing tensorflow test'
                    //     }
                    // }

                }
            }
        }
    
    } 