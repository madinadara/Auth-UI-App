package com.devapp.authuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView forgotPassoword;
    TextView register_now;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forgotPassoword = findViewById(R.id.forgot_password);
        register_now = findViewById(R.id.register_now);

        comingSoon(forgotPassoword);

        comingSoon(register_now);
    }

    private void comingSoon(TextView comingSoon) {
        comingSoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Coming Soon !", Toast.LENGTH_LONG).show();

            }
        });
    }

    private void registerNow(TextView registerNow) {

    }


    private void forgotPassword(TextView forgot_pass) {


    }





}