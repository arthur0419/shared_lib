package com.cambricon.test

import com.cambricon.test.Test;

class Module {
    Map config;
    Module(Map moduleConfig) {
        this.config = moduleConfig
    }
    void clone() {
        println("doing clone in Module!")
    }

    void build() {
        println("doing build in Module!")
    }

    List<Test> getTests() {
        return new ArrayList();
    }

    String getName() {
        return "module";
    }
}