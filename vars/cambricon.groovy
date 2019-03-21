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

        node {
            stage('build') {
                if (config.debug) {
                    echo 'doing build debug version'
                } else {
                    echo 'doing build release version'
                }
            }
        }
    
    } 