package com.cambricon.test

class Test {
    Map config
    
    Test(Map testConfig) {
        this.config = testConfig
    }

    void doTest() {
        println("doing test in Test!")
    }

    String getName() {
        return "test"
    }

    String getNode() {
        return "default"
    }
}