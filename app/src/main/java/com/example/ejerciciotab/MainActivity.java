package com.example.ejerciciotab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_primeraPantalla = findViewById(R.id.bt_pantalla1);
        Button bt_primeraPantalla2 = findViewById(R.id.bt_pantalla2);

        bt_primeraPantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TabLayout.class);
                startActivity(intent);
            }
        });
    }
}