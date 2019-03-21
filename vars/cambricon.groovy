def call(Closure callable) {
        def config = [:]
        callable.resolveStrategy = Closure.DELEGATE_FIRST;
        callable.delegate = config;
        callable.call()
        
        if (config.build) {
            config.buildConfig = [:]
            config.build.resolveStrategy = Closure.DELEGATE_FIRST
            config.build.delegate = config.buildConfig
            config.build()
        }
        
        // do something for cambricon
        echo 'Cambricon Config:'
        config.each{
            println(it.key + " : " + it.value)
            // echo it.key + " : " + it.value
        }

        echo 'Cambricon build config:'
        buildconfig.each{
            println(it.key + " : " + it.value)
            // echo it.key + " : " + it.value
        }
        
        println("do somthing in Cambricon");
    
    } 