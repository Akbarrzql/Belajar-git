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
    String Addres;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        name = "Abdul";
        email = ""+name+"@gmail.com";

        password = "12345";
        confirmPassword = "12345";
        phoneNumber = "0123456789";
        Addres = "indonesia";

        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Password : "+password);
        System.out.println("Confirm Password : "+confirmPassword);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Addres : "+Addres);
    }
}
