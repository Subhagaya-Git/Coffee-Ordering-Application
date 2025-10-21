package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    EditText userName2, password2;
    Button loginBtn;
    TextView registerBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        userName2 = findViewById(R.id.userNameID2);
        password2 = findViewById(R.id.passwordID2);
        loginBtn = findViewById(R.id.loginBtnID);
        registerBtn = findViewById(R.id.textVieRegID);


        Intent intent = getIntent();
        String regFirstName = intent.getStringExtra("fname");
        String regLastName = intent.getStringExtra("lname");
        String regMobileNum = intent.getStringExtra("mobile");
        String regUserName = intent.getStringExtra("uname");
        String regPassword = intent.getStringExtra("pwd");

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent1);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String enteredUser = userName2.getText().toString().trim();
                String enteredPass = password2.getText().toString().trim();

                if (enteredUser.isEmpty() || enteredPass.isEmpty()) {
                    Toast.makeText(MainActivity3.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (enteredUser.equals(regUserName) && enteredPass.equals(regPassword)) {
                    Toast.makeText(MainActivity3.this, "Login Successful", Toast.LENGTH_SHORT).show();


                    Intent homeIntent = new Intent(MainActivity3.this, MainActivity4.class);
                    homeIntent.putExtra("fname", regFirstName);
                    homeIntent.putExtra("lname", regLastName);
                    homeIntent.putExtra("mobile", regMobileNum);
                    homeIntent.putExtra("uname", regUserName);
                    homeIntent.putExtra("pwd", regPassword);
                    startActivity(homeIntent);

                } else {
                    Toast.makeText(MainActivity3.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }
}