package com.cambricon.test.caffe

import com.cambricon.test.Test

class CaffeOffline extends Test {

    CaffeOffline(steps, Map config) {
        super(steps, config)
    }
    
    void doTest() {
        steps.echo 'doing test in caffe offline test'
    }

    String getName() {
        return "caffe_offline"
    }
    
}