package com.example.ryuunotaro.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(quantity);
        displayPrice(quantity * 5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        String totalPrice = "Total: " + NumberFormat.getCurrencyInstance().format(number) + "\nThank You!";
        priceTextView.setText(totalPrice);
    }

    public void increment(View view){
        quantity++;
        display(quantity);
    }

    public void decrement(View view){
        quantity--;
        display(quantity);
    }
}
