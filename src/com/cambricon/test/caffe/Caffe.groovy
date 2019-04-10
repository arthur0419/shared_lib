package com.cambricon.test.caffe

import com.cambricon.test.Module
import com.cambricon.test.Test

class Caffe extends Module {

    Caffe(steps, Map config) {
        super(steps, config)
    }
    
    void cloneCode() {
        println("doing clone code for println!")
        steps.echo 'doing clone in caffe!'
    }

    void build() {
        steps.echo 'doing build in caffe!'
    }

    List<Test> getTests() {
        List<Test> tests = new ArrayList();
        tests.add(new CaffeGTest(steps, config));
        tests.add(new CaffeOffline(steps, config));
        return tests
    }

    String getName() {
        return "caffe"
    } 
}