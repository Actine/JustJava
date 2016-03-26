package com.example.actine.justjava;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int numberOfCups = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusOne(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        numberOfCups = numberOfCups + 1;
        display(numberOfCups);
    }

    private int getPrice(int numberOfCups) {
        return numberOfCups * 5;
    }

    public void minusOne(View view) {
        numberOfCups = numberOfCups - 1;
        display(numberOfCups);
    }

    private void display(int number) {
        ((TextView) findViewById(R.id.numberOfCups)).setText("Number: " + number);
        TextView price = (TextView) findViewById(R.id.price);
        price.setText("$" + getPrice(number) + ".00");

        if (number < 1) {
            price.setTextColor(Color.RED);
        } else {
            price.setTextColor(Color.BLACK);
        }
    }
}
