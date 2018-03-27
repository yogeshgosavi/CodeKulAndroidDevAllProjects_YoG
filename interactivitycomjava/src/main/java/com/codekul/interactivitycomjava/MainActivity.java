package com.codekul.interactivitycomjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    final private int RESULT_CODE = 11;
    final public String MSG="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.btnOk);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                Bundle bundle = new Bundle();
                EditText editText = (EditText)findViewById(R.id.txtSize);
                Float size= Float.parseFloat(editText.getText().toString());
                bundle.putFloat("defSize",size);
                i.putExtras(bundle);
                startActivityForResult(i,RESULT_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_CODE) {
            if(resultCode == RESULT_OK){
                Bundle bundle = data.getExtras();
                Log.i(MSG,"bundle"+bundle.getInt("ChkSize"));
                int fl = bundle.getInt("ChkSize");
                EditText editText = (EditText)findViewById(R.id.txtSize);
                String result= Integer.toString(fl);
                editText.setText(result);

            }
        }
    }
}

