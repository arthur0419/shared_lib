package com.cambricon.test.caffe

import com.cambricon.test.Module
import com.cambricon.test.Test

class Caffe extends Module {

    Caffe(script, Map config) {
        super(script, config)
    }
    
    void cloneCode() {
        println("doing clone code for println!")
        script.echo 'doing clone in caffe!'
    }

    void build() {
        script.echo 'doing build in caffe!'
    }

    List<Test> getTests() {
        List<Test> tests = new ArrayList();
        tests.add(new CaffeGTest(script, config));
        tests.add(new CaffeOffline(script, config));
        return tests
    }

    String getName() {
        return "caffe"
    } 
}