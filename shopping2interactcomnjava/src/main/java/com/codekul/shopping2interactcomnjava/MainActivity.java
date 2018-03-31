package com.codekul.shopping2interactcomnjava;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
    private int RESULT_CODE =11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Shopping App JAVA");


        Button btnjacket = findViewById(R.id.btnJackets);
        Button btnshirt = findViewById(R.id.btnshirts);
        Button btnjeans = findViewById(R.id.btnjeans);
        Button btncart = findViewById(R.id.btnCart);

        btnjeans.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,jeansActivity.class);
                        startActivityForResult(i,RESULT_CODE);
                    }
                }
        );

        btnshirt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,shirtActivity.class);
                        startActivityForResult(i,RESULT_CODE);
                    }
                }
        );
        btnjacket.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,jacketActivity.class);
                        startActivityForResult(i,RESULT_CODE);
                    }
                }
        );
        btncart.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this,CartActivity.class);
                        Bundle bundle = new Bundle(                        );
                        bundle.putString("data",((TextView)findViewById(R.id.showres)).getText().toString());
                        i.putExtras(bundle);
                        startActivity(i);
                    }
                }
        );

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_CODE) {
            if(data.getStringArrayListExtra("jeans")!=null){
                ((TextView)findViewById(R.id.showres)).setText(data.getStringArrayListExtra("jeans").toString());
            }
            if(data.getStringArrayListExtra("shirt")!=null){
                ((TextView)findViewById(R.id.showres)).append(data.getStringArrayListExtra("shirt").toString());
            }
            if(data.getStringArrayListExtra("jacket")!=null){
                ((TextView)findViewById(R.id.showres)).append(data.getStringArrayListExtra("jacket").toString());
            }

//            Toast.makeText(this, "Getting back something "+ ((TextView)findViewById(R.id.showres)).getText().toString() ,
//                    Toast.LENGTH_SHORT).show();
        }

    }
}
