package com.example.testcustomtestrunner;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MockTextModule {
    @Provides
    @Singleton
    GetText test() {
        return Mockito.mock(GetText.class);
    }
}
