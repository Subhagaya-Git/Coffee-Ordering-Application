package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity15 extends AppCompatActivity {

    Button paymentMethod, confirm;
    TextView textView, textView2;

    ImageView imgBack;

    String[] paymentOptions = {
            "PayPal",
            "Visa Card",
            "MasterCard",
            "Google Pay",
            "Bank Transfer",
            "Cash on Delivery"
    };

    int currentIndex = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        paymentMethod = findViewById(R.id.payMethodBtnID);
        confirm = findViewById(R.id.conBtnID);
        textView = findViewById(R.id.textViewID);
        textView2 = findViewById(R.id.textVie2ID);
        imgBack = findViewById(R.id.imgBackID5);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity15.this,MainActivity4.class);
                startActivity(intent);
            }
        });


        paymentMethod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String selectedMethod = paymentOptions[currentIndex];
                textView.setText(selectedMethod);
                textView2.setText("You selected: " + selectedMethod);

                currentIndex++;

                if (currentIndex >= paymentOptions.length) {
                    currentIndex = 0;
                }
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity15.this, MainActivity13.class);
                startActivity(intent);
            }
        });


    }
}