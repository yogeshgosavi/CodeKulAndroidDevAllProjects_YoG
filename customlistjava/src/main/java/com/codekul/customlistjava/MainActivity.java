package com.codekul.customlistjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    final ArrayList<String> rawdt = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customAdapterDemo();
        ListView lst = (ListView) findViewById(R.id.lst);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Touched Item : "+ rawdt.get(position), Toast.LENGTH_LONG).show();

            }
        });


    }
    private void customAdapterDemo(){
      //  rawdt.add(MyAdapter());
        //code not finished yet

    }
}
