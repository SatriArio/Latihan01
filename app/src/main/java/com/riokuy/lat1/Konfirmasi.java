package com.riokuy.lat1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Konfirmasi extends AppCompatActivity {
    //10116518 Satria Ario Pamungkas AKB12 Jumat, 5 April 2019

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);

        Button btn = (Button) findViewById(R.id.kembali);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Konfirmasi.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
