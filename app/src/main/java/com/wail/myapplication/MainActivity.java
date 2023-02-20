package com.wail.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public base_donne db=new base_donne(MainActivity.this,"login",null,1);
public Button bt;
public String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText l,p;
        l=findViewById(R.id.editTextTextPersonName);
        p=findViewById(R.id.editTextTextPersonName2);
        bt=findViewById(R.id.conect);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg= db.mainlogin(l.getText().toString(),p.getText().toString());
                if(msg.equals("yes")){
                    Intent intent=new Intent(MainActivity.this,calcul.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "conect invalide", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}