package com.codekul.yog.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String anInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);
        final TextView res = findViewById(R.id.disres);
        Button btn = findViewById(R.id.loginBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intVal = Integer.parseInt(editText.getText().toString());
                Log.i(anInt, "val of "+ intVal);
                String name=Integer.toString(intVal);
                Log.i("MSG","NAME : "+name);
                String pass = editText2.getText().toString();
                Log.i("MSG","PAss : "+pass);
                if(name.equals(pass)){
                    res.setText("SUCCESS");
                }
                else{
                    res.setText("FAILED");
                }
            }
        });
    }
}
