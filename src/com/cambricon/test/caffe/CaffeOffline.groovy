package com.cambricon.test.caffe

import com.cambricon.test.Test

class CaffeOffline extends Test {

    CaffeOffline(Map config) {
        super(config)
    }
    
    void doTest() {
        println("doing test in caffe offline test")
    }

    String getName() {
        return "caffe_offline"
    }
    
}