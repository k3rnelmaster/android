package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mMinusButton;
    private Button mPlusButton;
    private TextView mQuantityTextView;

    private int mQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        init();

        mMinusButton = findViewById(R.id.minus_button);
        mPlusButton = findViewById(R.id.plus_button);
        mQuantityTextView = findViewById(R.id.quantity_text);

        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

    private void init() {
        mQuantity = 0;
    }
}

























