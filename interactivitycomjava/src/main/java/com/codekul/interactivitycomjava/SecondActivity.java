package com.codekul.interactivitycomjava;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String KEY_RES = "res";
    public static final String MSG = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle b = new Bundle();
        b = getIntent().getExtras();
        TextView textView = (TextView)findViewById(R.id.txt);
        textView.setTextSize(b.getFloat("defSize"));
        final SeekBar seekBar = (SeekBar)findViewById(R.id.skbrSize);
        seekBar.setProgress((int)b.getFloat("defSize"));
        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        TextView textView = (TextView)findViewById(R.id.txt);
                        textView.setTextSize((progress));
                        Log.i(MSG,""+seekBar.getProgress());


                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );


        Button button = (Button)findViewById(R.id.btnbck);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i(MSG,"BUTTON METHOD");
                        Intent i =  new Intent();
                        Bundle bundle1 = new Bundle();
                        bundle1.putInt("ChkSize",seekBar.getProgress());
                        Log.i(MSG,""+seekBar.getProgress());
                        i.putExtras(bundle1);
                        setResult(Activity.RESULT_OK,i);
                        finish();
                    }
                }

        );



    }
}
