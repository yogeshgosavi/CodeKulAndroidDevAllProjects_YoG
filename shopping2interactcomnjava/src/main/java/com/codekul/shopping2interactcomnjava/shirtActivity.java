package com.codekul.shopping2interactcomnjava;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class shirtActivity extends AppCompatActivity {

    public ArrayList<String> shirt= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shirt);

        final TextView stTShirt = findViewById(R.id.stTshirt);
        final TextView stTuxeto = findViewById(R.id.stTuxeto);
        final TextView stPolo = findViewById(R.id.stPolo);
        final TextView stjersey = findViewById(R.id.stjersey);
        Button btnback = findViewById(R.id.btnbackShirt);


        stTShirt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        stTShirt.setBackgroundColor(Color.parseColor("#4a0072"));
                        stTShirt.setTextColor(Color.parseColor("#FFFFFFFF"));
                        shirt.add(stTShirt.getText().toString());
                    }
                }
        );

        stTuxeto.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        stTuxeto.setBackgroundColor(Color.parseColor("#4a0072"));
                        stTuxeto.setTextColor(Color.parseColor("#FFFFFFFF"));
                        shirt.add(stTuxeto.getText().toString());
                    }
                }
        );
        stPolo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        stPolo.setBackgroundColor(Color.parseColor("#4a0072"));
                        stPolo.setTextColor(Color.parseColor("#FFFFFFFF"));
                        shirt.add(stPolo.getText().toString());
                    }
                }
        );
        stjersey.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        stjersey.setBackgroundColor(Color.parseColor("#4a0072"));
                        stjersey.setTextColor(Color.parseColor("#FFFFFFFF"));
                        shirt.add(stjersey.getText().toString());
                    }
                }
        );

        btnback.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(shirt!= null) {
                            Intent i = new Intent();
                            i.putStringArrayListExtra("shirt", shirt);
                            setResult(RESULT_OK, i);
                        }
                        finish();
                    }
                }
        );

    }
}
