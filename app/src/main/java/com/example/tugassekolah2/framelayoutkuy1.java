package com.example.tugassekolah2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class framelayoutkuy1 extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayoutkuy1);

        btn =  findViewById(R.id.btnPindah22);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent pindahkuy = new Intent(framelayoutkuy1.this,frameLayoutKuy2.class);
                startActivity(pindahkuy);
            }
        });
    }
}
