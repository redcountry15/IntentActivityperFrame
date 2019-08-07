package com.example.tugassekolah2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn1 = (Button) findViewById(R.id.btnPindah);
     btn1.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View view){
             Intent pindahkuy = new Intent(MainActivity.this,framelayoutkuy1.class);
             startActivity(pindahkuy);
         }
     });



    }

}
