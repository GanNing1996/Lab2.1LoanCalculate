package com.example.taruc.lab21loancalculate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MONTHLY_PAYMENT="payment";
    public static final String LOAN_STATUS="status";
    private EditText editTextCarPrice, editTextDownPayment, editTextLoadPeriod, editTextInterestRate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCarPrice = (EditText)findViewById(R.id.editTextCarPrice);
        editTextDownPayment = (EditText)findViewById(R.id.editTextDownPayment);
        editTextLoadPeriod = (EditText)findViewById(R.id.editTextLoadPeriod);
        editTextInterestRate = (EditText)findViewById(R.id.editTextInterestRate);
    }

    public void calculateLoan(View view){
        //Create an Explicit intent
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);

        //loan application status; aprove or reject
        double monthlyPayment, vehiclePrice, downPayment, interestRate, loanPeriod;
        String status;

        vehiclePrice = Double.parseDouble(editTextCarPrice.getText().toString());
        downPayment = Double.parseDouble(editTextCarPrice.getText().toString());
        interestRate = Double.parseDouble(editTextCarPrice.getText().toString());
        loanPeriod = Double.parseDouble(editTextCarPrice.getText().toString());
        vehiclePrice = Double.parseDouble(editTextCarPrice.getText().toString());
        //Passing data using putExtra method
        //putExtra(TAG, value)
        intent.putExtra(MONTHLY_PAYMENT, monthlyPayment);
        intent.putExtra(LOAN_STATUS,status);
        startActivity(intent);
    }
}
