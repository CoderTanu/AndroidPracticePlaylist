package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sampleBtn= findViewById(R.id.button);

        sampleBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Intent exampleIntent= new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(exampleIntent);

            }
        });
    }
}