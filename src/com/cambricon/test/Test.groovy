package com.cambricon.test

class Test {
    def Map config
    def script
    Test(script, Map testConfig) {
        this.config = testConfig
        this.steps = steps
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