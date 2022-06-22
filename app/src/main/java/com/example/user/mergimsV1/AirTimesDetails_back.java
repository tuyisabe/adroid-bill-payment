package com.example.user.mergimsV1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AirTimesDetails_back extends AppCompatActivity {

    TextView mtn,tigo,airtel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_times_details_back);

        mtn = (TextView) findViewById(R.id.mtn);
        tigo = (TextView) findViewById(R.id.tigo);
        airtel = (TextView) findViewById(R.id.airtel);


        mtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mtn=new Intent(AirTimesDetails_back.this, AirtimeForm_Mtn_back.class);
                startActivity(mtn);

            }
        });

        tigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tigo=new Intent(AirTimesDetails_back.this, AirtimeForm_Tigo_back.class);
                startActivity(tigo);

            }
        });

        airtel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent airtel=new Intent(AirTimesDetails_back.this, AirtimeForm_Air_back.class);
                startActivity(airtel);

            }
        });

    }
}
