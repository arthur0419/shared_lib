package com.cambricon.test.caffe

import com.cambricon.test.Test

class CaffeGTest extends Test {

    CaffeGTest(steps, Map config) {
        super(steps, config)
    }
    
    void doTest() {
        steps.echo 'doing test in caffe gtest'
    }

    String getName() {
        return "caffe_gtest"
    }

}