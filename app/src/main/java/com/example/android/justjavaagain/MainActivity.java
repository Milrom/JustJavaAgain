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

    private int calculatePrice(){
        return numberOfCoffees * 5;
    }

    private String createOrderSummary(){
        return "Total: " + "$" + calculatePrice() + "\n" + "Thank you!";
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
        displayMessage(createOrderSummary());
    }

    private void displayMessage(String priceMessage) {
        TextView orderSummaryTextView = findViewById(R.id.orderSummary_text_view);
        orderSummaryTextView.setText("Name: Ryan Allen \n" + "Quantity: " + numberOfCoffees + "\n"
                + priceMessage);
    }


}
