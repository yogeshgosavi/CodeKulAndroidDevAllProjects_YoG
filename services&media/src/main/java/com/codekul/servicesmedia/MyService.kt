package com.codekul.servicesmedia

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : Service() {

    var mp : MediaPlayer? = null

    override fun onBind(intent: Intent): IBinder {
        throw UnsupportedOperationException("NOT YET IMPLEMENTED")


        TODO("Return the communication channel to the service.")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Thread{
            mp = MediaPlayer.create( this@MyService,R.raw.bob)
            mp?.start()
        }.start()
        return START_NOT_STICKY
    }
    override fun onDestroy() {
     mp?.stop()
        mp?.release()
       super.onDestroy()
    }
}

