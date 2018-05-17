package com.codekul.alerts_and_dialogsjava;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Toast(View view) {
        Toast.makeText(this, "HELLO", Toast.LENGTH_SHORT).show();
    }

    public void CustomToast(View view) {
      //  CustomToast(new Button(this));
//
        Toast toast = new Toast(this);
        toast.setView(new Button(this));
        toast.show();
    }

    public void Alert(View view) {
        show(MyDialogFragment.TAG_ALERT);
    }

    public void DatePicker(View view) {
        show(MyDialogFragment.TAG_DATE);

    }

    public void TimePIcker(View view) {
        show(MyDialogFragment.TAG_TIME);

    }

    public void progress(View view) {
        show(MyDialogFragment.TAG_PROGRESS);

    }

    public void Custom(View view) {
        show(MyDialogFragment.TAG_CUSTOM);

    }

    private void show(String tag) {
        MyDialogFragment dialog = new MyDialogFragment();
        dialog.show(getSupportFragmentManager(), tag);
    }
}
