package com.example.user.mergimsV1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class All_Services_back extends AppCompatActivity {

    TextView Airtime,Tv,Electricity,Others,Bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_services_back);

        Airtime =(TextView) findViewById(R.id.Airtime);
        Tv =(TextView) findViewById(R.id.Tv);
        Electricity =(TextView) findViewById(R.id.Electricity);
        Others =(TextView) findViewById(R.id.Others);
        Bus = (TextView) findViewById(R.id.Bus);

        Airtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent airtime=new Intent(All_Services_back.this,AirTimesDetails_back.class);
                startActivity(airtime);

            }
        });

        Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent tv=new Intent(All_Services_back.this, TvDetails_back.class);
                startActivity(tv);


            }
        });

        Bus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(All_Services_back.this, "NOT AVAILABLE NOW", Toast.LENGTH_SHORT).show();
                return;
            }
        });

        Electricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent electricity=new Intent(All_Services_back.this, ElectricityForm_back.class);
                startActivity(electricity);

            }
        });

        Others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Others=new Intent(All_Services_back.this, OthersDetails_back.class);
                startActivity(Others);

            }
        });

    }
}


