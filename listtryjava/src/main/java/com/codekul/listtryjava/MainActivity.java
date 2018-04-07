package com.codekul.listtryjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//Don't fucking declear your Veriable private over here use final next time onCreate method

    private int elementPos =0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<String> arrayList = new ArrayList< >();
        final ListView list = (ListView)findViewById(R.id.lst);
        final TextView tx =  findViewById(R.id.et);

        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");
        arrayList.add("Six");
        arrayList.add("Seven");


        final ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(adapter);

        (findViewById(R.id.btnOk)).setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ((ArrayAdapter<String>) list.getAdapter()).add((tx.getText().toString()));
                        ((ArrayAdapter<String>) list.getAdapter()).notifyDataSetChanged();
                        tx.setText("");
                    }
                });

        (findViewById(R.id.btnUpdate)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ((ArrayAdapter<String>) list.getAdapter()).remove(arrayList.get(elementPos));
                        ((ArrayAdapter<String>) list.getAdapter()).insert(tx.getText().toString(),elementPos);
                        ((ArrayAdapter<String>) list.getAdapter()).notifyDataSetChanged();
                        tx.setText("");
                    }
                }
        );


        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        tx.setText(arrayList.get(position));
                        elementPos = position;
                    }
                }
        );

        list.setOnItemLongClickListener(
                new AdapterView.OnItemLongClickListener(){
                    @Override
                    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                    adapter.remove(adapter.getItem(position));
                        return true;
                    }
                }
        );

    }



}

