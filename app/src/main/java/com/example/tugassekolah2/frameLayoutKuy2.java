package com.example.tugassekolah2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class frameLayoutKuy2 extends AppCompatActivity {
 Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_kuy2);

        button= findViewById(R.id.btnCuaca);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent pindahkuy = new Intent(frameLayoutKuy2.this,Waw.class);
                startActivity(pindahkuy);
            }
        });


    }
}
