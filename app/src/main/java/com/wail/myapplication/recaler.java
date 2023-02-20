package com.wail.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class recaler extends AppCompatActivity {
public int tmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recaler);
        Bundle extras = getIntent().getExtras();
//        tmp= extras.getString("log");
        tmp=extras.getInt("log");
        TextView n;
        n=findViewById(R.id.notes);

        n.setText(String.valueOf(tmp/3));
    }
}