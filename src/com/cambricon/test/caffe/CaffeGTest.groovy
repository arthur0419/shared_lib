package com.cambricon.test.caffe

import com.cambricon.test.Test

class CaffeGTest extends Test {

    def steps
    CaffeGTest(steps, Map config) {
        super(config)
        this.steps = steps;
    }
    
    void doTest() {
        steps.echo 'doing test in caffe gtest'
        println("doing println in caffe gtest")
    }

    String getName() {
        return "caffe_gtest"
    }

}