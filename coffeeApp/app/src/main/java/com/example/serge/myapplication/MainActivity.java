package com.example.serge.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity = 0;
    int coffeePrice = 5;

    /**
     * This method is called when the plus button is pushed.
     */
    public void increase (View view) {
        quantity = quantity + 1;
        display(quantity );
        displayPrice((quantity) * coffeePrice);
    }

    /**
     * This method is called when the minus button is pushed.
     */
    public void decrease (View view) {
        if (quantity > 0) {
            quantity = quantity - 1;
            display(quantity);
            displayPrice((quantity) * coffeePrice);
            }
    }



    private void displayMessage (String message) {
        TextView priceTextView = findViewById(R.id.price_textView);
        priceTextView.setText(message);
    }

    private void display(int quantity) {
        TextView totalQuantity = findViewById(R.id.totalQuantity_TextView);
        totalQuantity.setText("" + quantity);
    }

    /**
     * This method displays the given quantity value on screen.
     */
    private void displayPrice(int quantity) {
        TextView totalPriceTextView = findViewById(R.id.price_textView);
        totalPriceTextView.setText(NumberFormat.getCurrencyInstance().format(quantity));
    }
    /**
     * This method is called when submit button is pushed.
     */
    public void sumbitOrder (View view) {
        String priceMessage = "Total: $" + (quantity * coffeePrice) +"\nThank you!";
        displayMessage(priceMessage);
//        display(quantity);
//        displayPrice(quantity * coffeePrice);
    }

}
