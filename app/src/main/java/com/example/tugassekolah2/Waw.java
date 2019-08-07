package com.example.tugassekolah2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Waw extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waw);

        button = findViewById(R.id.btnAcu);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent pindahkuy = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.accuweather.com"));
                startActivity(pindahkuy);
            }
        });
    }
}
