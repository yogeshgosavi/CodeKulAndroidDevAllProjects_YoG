package com.codekul.shopping2interactcomnjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Intent i  =  getIntent();
        Bundle bundle = i.getExtras() ;
        String extras = bundle.getString("data");
       String updated = extras.replace("[","\n").replace(",","\n").replace("]","");
        ((TextView)findViewById(R.id.totalcart)).setText(updated);
    }
}
