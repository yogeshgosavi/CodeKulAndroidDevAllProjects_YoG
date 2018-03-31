package com.codekul.shopping2interactcomnjava;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class jeansActivity extends AppCompatActivity {

  public    ArrayList<String> jeans= new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeans);

        final TextView txtskinny = findViewById(R.id.txtskinny);
        final TextView txtslim = findViewById(R.id.txtslim);
        final TextView txtloose = findViewById(R.id.txtloose);
        final TextView txtrelax = findViewById(R.id.txtrelax);
        Button btnback = findViewById(R.id.btnbackjeans);

        txtskinny.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        txtskinny.setBackgroundColor(Color.parseColor("#4a0072"));
                        txtskinny.setTextColor(Color.parseColor("#FFFFFFFF"));
                        jeans.add(txtskinny.getText().toString());
                    }
                }
        );

        txtslim.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        txtslim.setBackgroundColor(Color.parseColor("#4a0072"));
                        txtslim.setTextColor(Color.parseColor("#FFFFFFFF"));
                        jeans.add(txtslim.getText().toString());
                    }
                }
        );
        txtloose.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        txtloose.setBackgroundColor(Color.parseColor("#4a0072"));
                        txtloose.setTextColor(Color.parseColor("#FFFFFFFF"));
                        jeans.add(txtloose.getText().toString());
                    }
                }
        );
        txtrelax.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        txtrelax.setBackgroundColor(Color.parseColor("#4a0072"));
                        txtrelax.setTextColor(Color.parseColor("#FFFFFFFF"));
                        jeans.add(txtrelax.getText().toString());
                    }
                }
        );

        btnback.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(jeans!= null) {
                            Intent i = new Intent();
                            i.putStringArrayListExtra("jeans", jeans);
                            setResult(RESULT_OK, i);
                        }
                        finish();
                    }
                }
        );
    }
}
