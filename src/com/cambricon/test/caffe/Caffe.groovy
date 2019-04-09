package com.cambricon.test.caffe

import com.cambricon.test.Module
import com.cambricon.test.Test

class Caffe extends Module {

    Caffe(Map config) {
        super(config)
    }
    
    void cloneCode() {
        echo 'doing clone in caffe!'
    }

    void build() {
        echo 'doing build in caffe!'
    }

    List<Test> getTests() {
        List<Test> tests = new ArrayList();
        tests.add(new CaffeGTest(config));
        tests.add(new CaffeOffline(config));
        return tests
    }

    String getName() {
        return "caffe"
    } 
}