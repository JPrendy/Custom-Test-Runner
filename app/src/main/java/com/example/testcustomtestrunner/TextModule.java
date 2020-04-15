package com.example.testcustomtestrunner;

import java.time.Clock;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TextModule {
    @Provides
    @Singleton
    GetText test() {
        return new GetText();
    }
}