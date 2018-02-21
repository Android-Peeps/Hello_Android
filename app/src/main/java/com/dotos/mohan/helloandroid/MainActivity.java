package com.dotos.mohan.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView textView = (TextView) findViewById(R.id.name);
        //textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_launcher_background, 0, 0, 0);
    }
}
