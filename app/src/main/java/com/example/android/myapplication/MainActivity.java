package com.example.android.myapplication;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name = findViewById(R.id.name);
        name.setText("Rachel");
        TextView country = findViewById(R.id.country);
        TextView birthday = findViewById(R.id.birthday);
        ImageView profile_picture = findViewById(R.id.profile_picture);
        Drawable drawable  = getResources().getDrawable(R.drawable.rachel);
        profile_picture.setImageResource(R.drawable.rachel);
        Log.d("myTag", "This is my message");
    }


}
