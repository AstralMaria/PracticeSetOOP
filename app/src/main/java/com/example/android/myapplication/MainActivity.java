package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView name = (TextView)findViewById(R.id.name);
        name.setText("Rachel");
        TextView country = (TextView)findViewById(R.id.country);
        TextView birthday = (TextView)findViewById(R.id.birthday);

    }


}
