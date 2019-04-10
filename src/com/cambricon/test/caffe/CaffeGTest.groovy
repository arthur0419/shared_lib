package com.cambricon.test.caffe

import com.cambricon.test.Test

class CaffeGTest extends Test {

    CaffeGTest(script, Map config) {
        super(script, config)
    }
    
    void doTest() {
        script.echo 'doing test in caffe gtest'
    }

    String getName() {
        return "caffe_gtest"
    }

}