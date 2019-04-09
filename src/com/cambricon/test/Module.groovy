package com.cambricon.test

import com.cambricon.test.Test;

class Module {
    def Map config;
    def steps
    Module(steps, Map moduleConfig) {
        this.config = moduleConfig
        this.steps = steps
    }
    void cloneCode() {
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