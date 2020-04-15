package com.example.testcustomtestrunner;

import org.w3c.dom.Text;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = TextModule.class)
public interface DemoComponent {
    void inject(MainActivity mainActivity);
}