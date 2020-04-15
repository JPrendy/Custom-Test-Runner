package com.example.testcustomtestrunner;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

public class DemoApplication extends Application {
    @Singleton
    @Component(modules = TextModule.class)
    public interface ApplicationComponent {
    }

    private final DemoComponent component = createComponent();

    protected DemoComponent createComponent() {
        return DaggerDemoComponent.builder().build();
    }

    public DemoComponent component() {
        return component;
    }
}
