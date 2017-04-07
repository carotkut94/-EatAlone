package com.death.eatalone.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(UserManager.isLoggedIn())
        {
            startActivity(new Intent(MainActivity.this, UserHome.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            finishActivity(0);
            this.finish();
        }
        else
        {
            startActivity(new Intent(MainActivity.this, LoginUser.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
            finishActivity(0);
            this.finish();
        }
    }
}
