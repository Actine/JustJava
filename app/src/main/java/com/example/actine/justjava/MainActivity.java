package com.example.actine.justjava;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Order order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        order = new Order();

        String[] types = getResources().getStringArray(R.array.types);

        ((TextView) findViewById(R.id.result_text)).setText(types[1]);
    }

    public void plusOne(View view) {
        order.increaseCups();
        updateOrderInfo();
    }

    public void minusOne(View view) {
        order.decreaseCups();
        updateOrderInfo();
    }

    public void order(View v) {
        String text = order.toString();

        TextView tv = (TextView) findViewById(R.id.result_text);
        tv.setText(text);
    }

    private void updateOrderInfo() {
        int number = order.getNumberOfCups();
        ((TextView) findViewById(R.id.numberOfCups)).setText("Number: " + number);
        TextView price = (TextView) findViewById(R.id.price);
        price.setText("$" + order.getPrice() + ".00");

        if (number < 1) {
            price.setTextColor(Color.RED);
        } else {
            price.setTextColor(Color.BLACK);
        }
    }
}
