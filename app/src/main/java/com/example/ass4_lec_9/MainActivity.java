package com.example.ass4_lec_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.progess);
        progressBar.setVisibility(View.VISIBLE);
    }
    public void SHOW(View V){
        progressBar.setVisibility(View.GONE);

    }
}