package com.codekul.intentfiltersava;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void workWithIntent(View view) {
        dial();

//        if(editText.getText().toString() != null){
//            Intent intent1 = new Intent();
//            intent.setAction("com.codekul.intentfilter.SEC");
//            intent.setData(Uri.parse(editText.getText().toString()));
//            startActivity(intent1);
//        }
    }

    private void intentway() {
        EditText editText = (EditText) findViewById(R.id.urlentered);
        Intent intent = new Intent();
        intent.setAction("com.codekul.intentfilter.SEC");
        intent.setData(Uri.parse("tel://1234567890"));
        startActivity(intent);
    }

    private void dial() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }

    private void call() {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel://9767292062"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(intent);
    }

    private  void weburl(){

        String url = "http://www.example.com";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));

    }

    private  void maps(){
        Intent i = new Intent((Intent.ACTION_VIEW));
        Uri location = Uri.parse("geo:37.422219,-122.08364?z=14");
        i.setData(location);
    }
}
