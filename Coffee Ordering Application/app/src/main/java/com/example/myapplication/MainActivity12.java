package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity12 extends AppCompatActivity {

    ImageView imagbackBtn;
    TextView coffName, coffType, sugarLevel, coffCups, totalAmt;
    Button cancelBtn, orderBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        // Initialize views
        imagbackBtn = findViewById(R.id.imgBackID4);
        coffName = findViewById(R.id.textVieCoffNameID4);
        coffType = findViewById(R.id.textVieCoffTypeID4);
        sugarLevel = findViewById(R.id.textVieSuarLevID4);
        coffCups = findViewById(R.id.textVieCoffCupID4);
        totalAmt = findViewById(R.id.textTotalAmtID4);
        cancelBtn = findViewById(R.id.cancelBtnID4);
        orderBtn = findViewById(R.id.orderBtnID4);


        Intent intent = getIntent();
        String coffeeType = intent.getStringExtra("coffeeType");
        int sugar = intent.getIntExtra("sugar", 0);
        int cups = intent.getIntExtra("cups", 1);
        int totalAmount = intent.getIntExtra("totalAmount", 0);


        coffName.setText("Cappuccino with Milo");
        coffType.setText(coffeeType);
        sugarLevel.setText( sugar + "g");
        coffCups.setText(String.valueOf(cups));            // ✅ FIXED
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
                Intent intent = new Intent(MainActivity12.this, MainActivity15.class);
                startActivity(intent);
            }
        });
    }
}