package com.example.testcustomtestrunner;

public class MockDemoApplication extends DemoApplication {
    @Override
    protected DemoComponent createComponent() {
        return DaggerExampleInstrumentedTest_TestComponent.builder().build();
    }
}