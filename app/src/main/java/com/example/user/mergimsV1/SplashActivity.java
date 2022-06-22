package com.example.user.mergimsV1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread welcomeThread = new Thread() {

            @Override
            public void run() {
                try {
                    super.run();
                    sleep(3000);//Delay of 10 seconds

                } catch (Exception e) {

                } finally {

                    Intent i = new Intent(SplashActivity.this,
                            FacebookLogin1.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }}
