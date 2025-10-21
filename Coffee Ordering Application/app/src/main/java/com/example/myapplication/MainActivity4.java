package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    TextView userinputName;
    ImageView image1, image2, image3, image4, profileimg;

    String regFirstName, regLastName, regMobileNum, regUserName, regPassword;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        userinputName = findViewById(R.id.LoginUserNameID);
        image1 = findViewById(R.id.image1ID);
        image2 = findViewById(R.id.image2ID);
        image3 = findViewById(R.id.image3ID);
        image4 = findViewById(R.id.image4ID);
        profileimg = findViewById(R.id.imageVieUserID);

        Intent intent = getIntent();
        regFirstName = intent.getStringExtra("fname");
        regLastName = intent.getStringExtra("lname");
        regMobileNum = intent.getStringExtra("mobile");
        regUserName = intent.getStringExtra("uname");
        regPassword = intent.getStringExtra("pwd");


        if (regUserName != null) {
            userinputName.setText(regUserName + ",");
        }

        profileimg.setOnClickListener(v -> {
            Intent intent1 = new Intent(MainActivity4.this, MainActivity14.class);
            intent1.putExtra("fname", regFirstName);
            intent1.putExtra("uname", regUserName);
            intent1.putExtra("mobile", regMobileNum);



            startActivity(intent1);
        });

        image1.setOnClickListener(v -> startActivity(new Intent(MainActivity4.this, MainActivity5.class)));
        image2.setOnClickListener(v -> startActivity(new Intent(MainActivity4.this, MainActivity6.class)));
        image3.setOnClickListener(v -> startActivity(new Intent(MainActivity4.this, MainActivity7.class)));
        image4.setOnClickListener(v -> startActivity(new Intent(MainActivity4.this, MainActivity8.class)));
    }
}
