package com.cambricon.test.caffe

import com.cambricon.test.Test

class CaffeGTest extends Test {

    CaffeGTest(Map config) {
        super(config)
    }
    
    void doTest() {
        println("doing test in caffe gtest")
    }

    String getName() {
        return "caffe_gtest"
    }

}