package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity10 extends AppCompatActivity {

    ImageView imagbackBtn;
    TextView coffName, coffType, sugarLevel, coffCups, totalAmt;
    Button cancelBtn, orderBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        // Initialize views
        imagbackBtn = findViewById(R.id.imgBackID2);
        coffName = findViewById(R.id.textVieCoffNameID2);
        coffType = findViewById(R.id.textVieCoffTypeID2);
        sugarLevel = findViewById(R.id.textVieSuarLevID2);
        coffCups = findViewById(R.id.textVieCoffCupID2);
        totalAmt = findViewById(R.id.textTotalAmtID2);
        cancelBtn = findViewById(R.id.cancelBtnID2);
        orderBtn = findViewById(R.id.orderBtnID2);

        // Get values from Intent
        Intent intent = getIntent();
        String coffeeType = intent.getStringExtra("coffeeType");
        int sugar = intent.getIntExtra("sugar", 0);
        int cups = intent.getIntExtra("cups", 1);
        int totalAmount = intent.getIntExtra("totalAmount", 0);

        // Set values into text views
        coffName.setText("Cappuccino Lait");
        coffType.setText(coffeeType);
        sugarLevel.setText(sugar + "g");
        coffCups.setText(String.valueOf(cups));
        totalAmt.setText(String.valueOf(totalAmount));

        // Back button
        imagbackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Cancel button
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Order button
        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity10.this, MainActivity15.class);
                startActivity(intent);
            }
        });
    }
}