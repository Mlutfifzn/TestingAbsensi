package com.example.testingabsensi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void submit(View view) {
        Intent inten = new Intent(Login.this,Dashboard.class);
        startActivity(inten); //validasi login//
    }
}