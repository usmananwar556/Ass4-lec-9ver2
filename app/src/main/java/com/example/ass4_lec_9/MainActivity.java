package com.example.ass4_lec_9;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.progess);
        Object context;
        dialog = new progressDialog(context:this)
    }
    public void SHOW(View V){
       dialog.setTitle("My Progress");
       dialog.setMessage("Please wait.....");
       dialog.setIcon(R.drawable.ic_launcher_background);
       dialog.setCancelable(false);
       dialog.show();
       //dialog.dismiss();

    }
}