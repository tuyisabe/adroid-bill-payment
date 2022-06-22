package com.example.user.mergimsV1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AirTimesDetails extends AppCompatActivity {

    TextView mtn,tigo,airtel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_times_details);

        mtn = (TextView) findViewById(R.id.mtn);
        tigo = (TextView) findViewById(R.id.tigo);
        airtel = (TextView) findViewById(R.id.airtel);


        mtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mtn=new Intent(AirTimesDetails.this, AirtimeForm_Mtn.class);
                startActivity(mtn);

            }
        });

        tigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tigo=new Intent(AirTimesDetails.this, AirtimeForm_Tigo.class);
                startActivity(tigo);

            }
        });

        airtel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent airtel=new Intent(AirTimesDetails.this, AirtimeForm_Air.class);
                startActivity(airtel);

            }
        });

    }
}
