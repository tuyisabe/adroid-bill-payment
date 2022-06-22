package com.example.user.mergimsV1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TvDetails extends AppCompatActivity {

    TextView Startime,dstv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_details);

        Startime =(TextView) findViewById(R.id.Startime);
        dstv = (TextView) findViewById(R.id.dstv);

        Startime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startime=new Intent(TvDetails.this, com.example.user.mergimsV1.StartimeForm.class);
                startActivity(startime);

            }
        });

        dstv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TvDetails.this, "NOT AVAILABLE NOW", Toast.LENGTH_SHORT).show();
                return;

            }
        });
    }
}
