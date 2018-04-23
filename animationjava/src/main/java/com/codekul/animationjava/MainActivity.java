package com.codekul.animationjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnrotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate(R.anim.rotate);
            }
        });
        findViewById(R.id.btnzoom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate(R.anim.zoom);
            }
        });

        findViewById(R.id.btnmixed).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate(R.anim.mixed);
            }
        });


    }
    private void animate(int res){
    findViewById(R.id.imageView).startAnimation(android.view.animation.AnimationUtils.loadAnimation(this,res));
    }
}
