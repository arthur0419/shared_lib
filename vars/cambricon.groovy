def call(Map config) {
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
        stage('build') {
            steps {
                echo 'cambricon build!'
                helloworld 'jenkins'
            }
        }
    
    } 