package com.example.tugassekolah2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intentNya extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_nya);

        button1 = (Button) findViewById(R.id.btnTugas1);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent pindahkuy = new Intent(intentNya.this,MainActivity.class);
                startActivity(pindahkuy);
            }
        });






    }

}
