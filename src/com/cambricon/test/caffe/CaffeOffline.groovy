package com.cambricon.test.caffe

import com.cambricon.test.Test

class CaffeOffline extends Test {

    CaffeOffline(script, Map config) {
        super(script, config)
    }
    
    void doTest() {
        script.echo 'doing test in caffe offline test'
    }

    String getName() {
        return "caffe_offline"
    }
    
}