package com.example.user.mergimsV1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class FacebookLogin1 extends AppCompatActivity {
    LoginButton login_button;
    CallbackManager callbackManager;
    TextView txtStatus;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_facebooklogin);
        initializeControl();
        LoginWithFB();

    }

    private void initializeControl(){

        callbackManager = CallbackManager.Factory.create();
        login_button = (LoginButton) findViewById(R.id.login_button);
        txtStatus = (TextView) findViewById(R.id.txtStatus);
        btn = (Button) findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent btn = new Intent(FacebookLogin1.this, com.example.user.mergimsV1.All_Services.class);
                startActivity(btn);
            }
        });

    }

    private void LoginWithFB(){


        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                txtStatus.setText("Login Sucess\n");

                Intent paypal=new Intent(FacebookLogin1.this,PaypalActivity.class);
                startActivity(paypal);

            }

            @Override
            public void onCancel() {

                txtStatus.setText("Login Cancelled.");
            }

            @Override
            public void onError(FacebookException error) {

                txtStatus.setText("Login Error:\n check your internet");

            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);




    }



}
