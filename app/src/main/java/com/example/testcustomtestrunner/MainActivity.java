package com.example.testcustomtestrunner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myAwesomeTextView = (TextView)findViewById(R.id.start);
        myAwesomeTextView.setText(GetText.getText());
    }
}
