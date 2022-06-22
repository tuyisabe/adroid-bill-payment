package com.example.user.mergimsV1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class OthersDetails extends AppCompatActivity {


    TextView watertv,gastv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_details);

        watertv = (TextView) findViewById(R.id.watertv);
        gastv = (TextView) findViewById(R.id.gastv);


        watertv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(OthersDetails.this, "NOT AVAILABLE NOW", Toast.LENGTH_SHORT).show();
                return;

            }
        });

        gastv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(OthersDetails.this, "NOT AVAILABLE NOW", Toast.LENGTH_SHORT).show();
                return;

            }
        });


    }
}
