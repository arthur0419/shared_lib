package com.cambricon.test.caffe

import com.cambricon.test.Module
import com.cambricon.test.Test

class Caffe extends Module {
    
    void cloneCode() {
        println("doing clone in caffe!")
    }

    void build() {
        println("doing build in caffe!")
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