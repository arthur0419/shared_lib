def call(Map config) {
        
        // do something for cambricon
        echo 'Cambricon Config:'
        script {
            config.each{
                println(it.key + " : " + it.value)
                // echo it.key + " : " + it.value
            }
        }

        // echo 'Cambricon build config:'
        // buildconfig.each{
        //     println(it.key + " : " + it.value)
        //     // echo it.key + " : " + it.value
        // }
        
        echo 'do somthing in Cambricon'
    
    } 