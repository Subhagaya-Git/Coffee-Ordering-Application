package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity14 extends AppCompatActivity {

    ImageView imgbackBtn;
    Button backBtn, logOutBtn;
    TextView textView1, textView2, textView3;

    String fname, uname, mobile;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        imgbackBtn = findViewById(R.id.imgBackID);
        backBtn = findViewById(R.id.backBtnID);
        logOutBtn = findViewById(R.id.logOutBtnID);
        textView1 = findViewById(R.id.textView1ID);
        textView2 = findViewById(R.id.textView2ID);
        textView3 = findViewById(R.id.textView3ID);

        Intent intent = getIntent();
        fname = intent.getStringExtra("fname");
        uname = intent.getStringExtra("uname");
        mobile = intent.getStringExtra("mobile");



        if (fname == null || uname == null || mobile == null) {
            Toast.makeText(this, "Missing profile data", Toast.LENGTH_LONG).show();

        } else {
            textView1.setText(fname);
            textView2.setText(uname);
            textView3.setText(mobile);
        }

        View.OnClickListener backToHome = v -> {
            Intent backIntent = new Intent(MainActivity14.this, MainActivity4.class);
            backIntent.putExtra("fname", fname);
            backIntent.putExtra("uname", uname);
            backIntent.putExtra("mobile", mobile);
            startActivity(backIntent);
            finish();
        };

        imgbackBtn.setOnClickListener(backToHome);
        backBtn.setOnClickListener(backToHome);

        logOutBtn.setOnClickListener(v -> {
            Intent logoutIntent = new Intent(MainActivity14.this, MainActivity3.class);
            startActivity(logoutIntent);
            finish();
        });
    }
}
