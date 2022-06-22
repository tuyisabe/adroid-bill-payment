package com.example.user.mergimsV1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        imageView.startAnimation(animation);

        Thread timer = new Thread(){

            @Override
            public void run() {

                try {
                    sleep(5000);

                    Intent intent = new Intent(getApplicationContext(),All_Services.class);

                    startActivity(intent);
                    finish();
                    super.run();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };

        timer.start();


    }
}








