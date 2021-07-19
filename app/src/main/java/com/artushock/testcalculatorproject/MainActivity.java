package com.artushock.testcalculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculatorButton = findViewById(R.id.calculator_open_button);
        calculatorButton.setOnClickListener(v -> {
            Intent calculatorIntent = new Intent();
            calculatorIntent.setAction(Intent.ACTION_MAIN);
            calculatorIntent.addCategory(Intent.CATEGORY_APP_CALCULATOR);
            calculatorIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(calculatorIntent);
        });
    }
}