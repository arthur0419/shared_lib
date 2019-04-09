package com.cambricon.test.caffe

import com.cambrion.test.Module

class Caffe extends Module {
    
    void clone() {
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