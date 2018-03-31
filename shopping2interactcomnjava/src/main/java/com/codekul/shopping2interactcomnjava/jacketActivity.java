package com.codekul.shopping2interactcomnjava;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class jacketActivity extends AppCompatActivity {

    public ArrayList<String> jacket= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jacket);


        final TextView drj = findViewById(R.id.drj);
        final TextView bfj = findViewById(R.id.bfj);
        final TextView mrj = findViewById(R.id.mrj);
        final TextView vj = findViewById(R.id.vj);
        Button btnback = findViewById(R.id.btnbackJacket);


        drj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        drj.setBackgroundColor(Color.parseColor("#4a0072"));
                        drj.setTextColor(Color.parseColor("#FFFFFFFF"));
                        jacket.add(drj.getText().toString());
                    }
                }
        );

        bfj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        bfj.setBackgroundColor(Color.parseColor("#4a0072"));
                        bfj.setTextColor(Color.parseColor("#FFFFFFFF"));
                        jacket.add(bfj.getText().toString());
                    }
                }
        );
        mrj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        mrj.setBackgroundColor(Color.parseColor("#4a0072"));
                        mrj.setTextColor(Color.parseColor("#FFFFFFFF"));
                        jacket.add(mrj.getText().toString());
                    }
                }
        );
        vj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        vj.setBackgroundColor(Color.parseColor("#4a0072"));
                        vj.setTextColor(Color.parseColor("#FFFFFFFF"));
                        jacket.add(vj.getText().toString());
                    }
                }
        );

        btnback.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(jacket!= null) {
                            Intent i = new Intent();
                            i.putStringArrayListExtra("jacket",
                                    jacket);
                            setResult(RESULT_OK, i);
                        }
                        finish();
                    }
                }
        );

    }
}
