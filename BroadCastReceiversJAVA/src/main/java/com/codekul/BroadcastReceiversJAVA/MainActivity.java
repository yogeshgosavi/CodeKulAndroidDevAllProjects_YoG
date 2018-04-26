package com.codekul.BroadcastReceiversJAVA;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver broadcastReceiver= new BroadcastReceiver(){

        @Override
        public void onReceive(Context context, Intent intent) {

            if (intent.getBooleanExtra("state", false)) {
                Toast.makeText(context,"AIRPLANE MODE CHANGED",Toast.LENGTH_LONG).show();
                findViewById(R.id.imgVw).setBackgroundResource(R.drawable.ic_airplanemode_active);
            }else{
                Toast.makeText(context,"AIRPLANE MODE CHANGED",Toast.LENGTH_LONG).show();
                findViewById(R.id.imgVw).setBackgroundResource(R.drawable.ic_airplanemode_inactive);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Best place to register Broadcast Receivers
    @Override
    protected void onStart() {
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(broadcastReceiver,filter);
        super.onStart();
    }

    //Best place to deregister Broadcast Receivers
    @Override
    protected void onStop() {
        unregisterReceiver(broadcastReceiver);
        super.onStop();
    }
}
