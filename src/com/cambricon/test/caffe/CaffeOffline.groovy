package com.cambricon.test.caffe

import com.cambricon.test.Test

class CaffeOffline extends Test {

    def steps
    CaffeOffline(steps, Map config) {
        super(config)
        this.steps = steps;
    }
    
    void doTest() {
        steps.echo 'doing test in caffe offline test'
    }

    String getName() {
        return "caffe_offline"
    }
    
}