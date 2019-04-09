package com.cambricon.test.caffe

import com.cambricon.test.Module
import com.cambricon.test.Test

def my_echo(text) {
  echo '${text}'
}

class Caffe extends Module {

    Caffe(Map config) {
        this.steps = steps
        super(config)
    }
    
    void cloneCode() {
        my_echo('doing clone in caffe!')
    }

    void build() {
        my_echo('doing build in caffe!')
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