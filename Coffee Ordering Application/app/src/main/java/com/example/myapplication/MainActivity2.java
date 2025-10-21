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

public class MainActivity2 extends AppCompatActivity {

    EditText firstName, lastName, mobileNum, userName, password, confPwd;
    Button regBtn;

    TextView textViLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        firstName = findViewById(R.id.firstNameID);
        lastName = findViewById(R.id.lastNameID);
        mobileNum = findViewById(R.id.mobNumID);
        userName = findViewById(R.id.userNameID);
        password = findViewById(R.id.passwordID);
        confPwd = findViewById(R.id.confPwdID);
        regBtn = findViewById(R.id.regBtnID);
        textViLogin = findViewById(R.id.textVieLoginID);

        textViLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strFirstName = firstName.getText().toString().trim();
                String strLastName = lastName.getText().toString().trim();
                String strMobileNum = mobileNum.getText().toString().trim();
                String strUserName = userName.getText().toString().trim();
                String strPassword = password.getText().toString().trim();
                String strConfPwd = confPwd.getText().toString().trim();

                // Validation
                if (strFirstName.isEmpty() || strLastName.isEmpty() || strMobileNum.isEmpty() ||
                        strUserName.isEmpty() || strPassword.isEmpty() || strConfPwd.isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Mobile number must be 10 digits
                if (strMobileNum.length() != 10 || !strMobileNum.matches("\\d+")) {
                    Toast.makeText(getApplicationContext(), "Enter a valid 10-digit mobile number", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Username must be at least 4 characters
                if (strUserName.length() < 4) {
                    Toast.makeText(getApplicationContext(), "Username must be at least 4 characters", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Password must be at least 6 characters and contain a num
                if (strPassword.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Password must be at least 6 characters", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!strPassword.matches(".*\\d.*")) {
                    Toast.makeText(getApplicationContext(), "Password must contain at least one number", Toast.LENGTH_SHORT).show();
                    return;
                }


                if (!strPassword.equals(strConfPwd)) {
                    Toast.makeText(getApplicationContext(), "Password and Confirm Password do not match", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(getApplicationContext(), "Registration Successful", Toast.LENGTH_SHORT).show();


                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("fname", strFirstName);
                intent.putExtra("lname", strLastName);
                intent.putExtra("mobile", strMobileNum);
                intent.putExtra("uname", strUserName);
                intent.putExtra("pwd", strPassword);
                startActivity(intent);


            }
        });


    }
}