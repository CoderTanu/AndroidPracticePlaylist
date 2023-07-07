package com.example.day13multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Order extends AppCompatActivity {


    private TextView ordertxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ordertxt =findViewById(R.id.orderText);
        String orderOfCustomer = getIntent().getStringExtra(MainActivity.KEY);

        ordertxt.setText("Order Placed " + orderOfCustomer.toString());


       Button thankBtn =findViewById(R.id.button2);

        thankBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Thanks for order, have a nice day!", Toast.LENGTH_SHORT).show();}
        } );




    }
}