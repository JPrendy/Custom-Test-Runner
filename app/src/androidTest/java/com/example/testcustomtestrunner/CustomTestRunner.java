package com.example.testcustomtestrunner;

import android.app.Application;
import android.content.Context;

import androidx.test.runner.AndroidJUnitRunner;

public class CustomTestRunner extends AndroidJUnitRunner {

    @Override
    public Application newApplication(ClassLoader cl,
                                      String className,
                                      Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        //I'm changing the application class only for test purposes. there I'll instantiate AppModule with RESTMock's url.
        return super.newApplication(cl, MockDemoApplication.class.getName(), context);
    }
}
