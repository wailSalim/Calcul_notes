package com.wail.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class calcul extends AppCompatActivity {
public  int r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcul2);
        EditText t1,t2,t3;
        t1=findViewById(R.id.editTextNumber);
        t2=findViewById(R.id.editTextNumber2);
        t3=findViewById(R.id.editTextNumber3);
        Button b;
        b=findViewById(R.id.calcul);
        Bundle bundle=new Bundle();
//        int t=Integer.parseInt(t1.getText().toString());
//        int tt=Integer.parseInt(t2.getText().toString());
//        int ttt=Integer.parseInt(t3.getText().toString());
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(t1.getText().toString())<=20 && Integer.parseInt(t1.getText().toString())>=0 &&
                        Integer.parseInt(t2.getText().toString())<=20 && Integer.parseInt(t2.getText().toString())>=0 &&
                        Integer.parseInt(t3.getText().toString())<=20 && Integer.parseInt(t3.getText().toString())>=0  ){
                r=Integer.parseInt(t1.getText().toString())+Integer.parseInt(t2.getText().toString())+Integer.parseInt(t3.getText().toString());
                if((r/3)<10){
                    Intent intent=new Intent(calcul.this,recaler.class);
                    intent.putExtra("log",r);
                    startActivity(intent);
                }else{
                    Intent intent=new Intent(calcul.this,ressit.class);
                    intent.putExtra("log",r);
                    startActivity(intent);
                }} else{
                    Toast.makeText(calcul.this, "notes doit etre entre 0 et 20 .", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}