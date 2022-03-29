package com.example.learningapps;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class JS extends AppCompatActivity {

    String name;
    String email;
    String password;
    String confirmPassword;
    String phoneNumber;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        name = "Abdul";
        email = ""+name+"@gmail.com";

        password = "12345";
        confirmPassword = "12345";
        phoneNumber = "0123456789";
    }
}
