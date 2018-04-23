package com.codekul.gridlayoutjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<myItem> dataset = new ArrayList<>();
        dataset.add(new myItem(R.drawable.ic_launcher_background,"background0"));
        dataset.add(new myItem(R.drawable.ic_launcher_background,"background1"));
        dataset.add(new myItem(R.drawable.ic_launcher_background,"background2"));
        dataset.add(new myItem(R.drawable.ic_launcher_background,"background3"));
        dataset.add(new myItem(R.drawable.ic_launcher_background,"background4"));
        dataset.add(new myItem(R.drawable.ic_launcher_background,"background5"));



        myAdapter adapter = new myAdapter(this,dataset);

        ((GridView)findViewById(R.id.grid)).setAdapter(adapter);
    }
}
