package com.codekul.BroadcastReceiversJAVA;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context,"APP NOT RUNNING, AIRPLANE MODE CHANGED",Toast.LENGTH_LONG).show();

        throw new UnsupportedOperationException("Not yet implemented");
    }
}
