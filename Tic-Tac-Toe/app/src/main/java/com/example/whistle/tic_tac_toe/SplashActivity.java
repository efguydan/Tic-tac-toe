package com.example.whistle.tic_tac_toe;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //To hide the Action bar
        getSupportActionBar().hide();

        /*
        Delaying the Splash Screen
         */
        Runnable runnable3secs = new Runnable() {
            @Override
            public void run() {
                nextActivity();
                finish();
            }
        };

        Handler myHandler = new Handler();
        myHandler.postDelayed(runnable3secs, 3000);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run(){
//                nextActivity();
//                finish();
//            }
//
//        },3000);
    }

    public void nextActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
