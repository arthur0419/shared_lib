def call(Map config) {
        
        script {
            def debug = true
        }
        // do something for cambricon
        echo 'Cambricon Config:'
        script {
            config.each{
                println(it.key + " : " + it.value)
                // echo it.key + " : " + it.value
            }
            if (config.debug) {
                debug = config.debug
            }
        }
        echo "${debug}"
        echo "${config.debug}"

        // echo 'Cambricon build config:'
        // buildconfig.each{
        //     println(it.key + " : " + it.value)
        //     // echo it.key + " : " + it.value
        // }
        
        echo 'do somthing in Cambricon'
    
    } 