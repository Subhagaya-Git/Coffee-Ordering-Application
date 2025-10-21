package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    Button placeOrderBtn;
    RadioGroup radioGroupCoffee;
    RadioButton radioHot, radioCold;
    SeekBar seekBarSugar, seekBarNumOfCup;
    TextView textViewSugar, textViewNumOfCup, textViewTotalAmt;
    ImageView backBtn;

    int sugarValue = 0;
    int cupValue = 1;
    int pricePerCup = 700;
    int totalAmount = 700;
    String coffeeType = "";

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        backBtn = findViewById(R.id.imageBackID);
        placeOrderBtn = findViewById(R.id.placeOrderBtnID);
        radioGroupCoffee = findViewById(R.id.radioGroupCoffeeID);
        radioHot = findViewById(R.id.radioHotID);
        radioCold = findViewById(R.id.radioColdID);
        seekBarSugar = findViewById(R.id.seekBarSugarID);
        seekBarNumOfCup = findViewById(R.id.seekBarCupID);
        textViewSugar = findViewById(R.id.textVieSugarID);
        textViewNumOfCup = findViewById(R.id.textVieCupID);
        textViewTotalAmt = findViewById(R.id.textVieTotalAmtID);

        // Default values
        textViewSugar.setText("Sugar: 0");
        textViewNumOfCup.setText("Cups: 1");
        textViewTotalAmt.setText("Total Amount: " + pricePerCup);

        // Back button
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        // Sugar SeekBar
        seekBarSugar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sugarValue = progress;
                textViewSugar.setText("Sugar: " + sugarValue + "g");
            }

            @Override public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        // Cups SeekBar
        seekBarNumOfCup.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress == 0) progress = 1; // At least 1 cup
                cupValue = progress;
                totalAmount = cupValue * pricePerCup;
                textViewNumOfCup.setText("Cups: " + cupValue);
                textViewTotalAmt.setText("Total Amount: " + totalAmount);
            }

            @Override public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        // Place Order Button
        placeOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = radioGroupCoffee.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(MainActivity5.this, "Please select Hot or Cold coffee", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (radioHot.isChecked()) {
                    coffeeType = "Hot";
                } else if (radioCold.isChecked()) {
                    coffeeType = "Cold";
                }

                // Send data to MainActivity9
                Intent intent = new Intent(MainActivity5.this, MainActivity9.class);
                intent.putExtra("coffeeType", coffeeType);
                intent.putExtra("sugar", sugarValue);
                intent.putExtra("cups", cupValue);
                intent.putExtra("totalAmount", totalAmount);
                startActivity(intent);

                Toast.makeText(MainActivity5.this, "Order Successful!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}