package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    public static final int QUANTITY_MIN = 0;
    public static final int QUANTITY_MAX = 10;
    public static final int COFFEE_PRICE = 3000;
    private Button mMinusButton;
    private Button mPlusButton;
    private Button mOrderButton;
    private TextView mQuantityTextView;
    private TextView mResultTextView;

    private int mQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        init();

        mMinusButton = findViewById(R.id.minus_button);
        mPlusButton = findViewById(R.id.plus_button);
        mOrderButton = findViewById(R.id.order_button);
        mQuantityTextView = findViewById(R.id.quantity_text);
        mResultTextView = findViewById(R.id.result_text);

        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mQuantity <= QUANTITY_MIN)
                    ;
                else
                    mQuantity = mQuantity - 1;

                displayResult();
            }
        });

        mPlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mQuantity >= QUANTITY_MAX)
                    ;
                else
                    mQuantity = mQuantity + 1;

                displayResult();
            }
        });

        mOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = mResultTextView.getText().toString();
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void displayResult() {
        mQuantityTextView.setText("" + mQuantity);
        String result = "가격: " + (COFFEE_PRICE * mQuantity) + "원\n감사합니다.";
        mResultTextView.setText(result);
    }

    private void init() {
        mQuantity = 0;
    }
}

























