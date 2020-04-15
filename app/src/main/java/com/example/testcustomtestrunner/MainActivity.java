package com.example.testcustomtestrunner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    GetText getText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DemoApplication) getApplication()).component().inject(this);

        TextView myAwesomeTextView = (TextView)findViewById(R.id.start);
        myAwesomeTextView.setText(getText.getText());
    }
}
