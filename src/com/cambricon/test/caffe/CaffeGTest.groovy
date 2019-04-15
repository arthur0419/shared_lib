package com.cambricon.test.caffe

import com.cambricon.test.Test

class CaffeGTest extends Test {

    CaffeGTest(script, Map config) {
        super(script, config)
    }
    
    void doTest() {
        
        script.echo 'doing test in caffe gtest'

        def methods = script.getMetaClass().getMethods()

        for (method in methods) {
            script.echo method.getName()
        }

        script.echo "hello world ${script.params.visitor}"
    }

    String getName() {
        return "caffe_gtest"
    }

}