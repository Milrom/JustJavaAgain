package com.example.android.justjavaagain;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int numberOfCoffees = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display(int i){
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + i);

    }

    private void displayPrice(int i){
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText("$" + i);
    }

    public void increment(View view) {
        numberOfCoffees++;
        display(numberOfCoffees);

    }

    public void decrement(View view) {
        if(numberOfCoffees > 0){
            numberOfCoffees--;
            display(numberOfCoffees);
        }
    }

    public void orderSubmit(View view) {
        String priceMessage = "Total: " + "$" + numberOfCoffees * 5;
        priceMessage = priceMessage + "\n" + "Thank you!";
        displayMessage(priceMessage);
    }

    private void displayMessage(String priceMessage) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(priceMessage);
    }


}
