package com.example.user.mergimsV1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;

public class ElectricityForm extends AppCompatActivity implements View.OnClickListener {

    //The view objects
    private EditText editTextCashpower, editTextEmail, editTextMobile,
            editTextDob, editTextAge;

    private Button buttonSubmit;

    //defining AwesomeValidation object
    private AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity_form);

        //initializing awesomevalidation object
        /*
        * The library provides 3 types of validation
        * BASIC
        * COLORATION
        * UNDERLABEL
        * */
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        //initializing view objects
                editTextMobile = (EditText) findViewById(R.id.editTextMobile);
        editTextCashpower = (EditText) findViewById(R.id.editTextCashpower);

        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);


        //adding validation to edittexts
        awesomeValidation.addValidation(this, R.id.editTextCashpower, "^[0,1]{1}[7,4]{1}[0-9]{9}$", R.string.cashpowererror);
        awesomeValidation.addValidation(this, R.id.editTextMobile, "^[0,7]{2}[2,3,8]{1}[0-9]{7}$", R.string.mobileerror);
       // awesomeValidation.addValidation(this, R.id.editTextMobile, "^[0][7][3][0-9]{7}$", R.string.nameerror);
       // awesomeValidation.addValidation(this, R.id.editTextMobile, "^[0][7][8][0-9]{7}$", R.string.nameerror);

        buttonSubmit.setOnClickListener(this);
    }

    private void submitForm() {
        //first validate the form then move ahead
        //if this becomes true that means validation is successfull
        if (awesomeValidation.validate()) {
            Toast.makeText(this, "Validation Successfull", Toast.LENGTH_LONG).show();

            //process the data further
            Intent tigo=new Intent(ElectricityForm.this, SplashActivity.class);
            startActivity(tigo);
        }
    }

    @Override
    public void onClick(View view) {
        if (view == buttonSubmit) {
            submitForm();



        }

    }}
