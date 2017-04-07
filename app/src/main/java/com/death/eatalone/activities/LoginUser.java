package com.death.eatalone.activities;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.death.eatalone.R;


/**
 * Created by rajora_sd on 4/6/2017.
 */

public class LoginUser extends AppCompatActivity{

    TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.heading);
    }
}
