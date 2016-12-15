package com.example.julian.a2panelsfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragmenta.Comunicador {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void mensaje(String texto) {
            Main2ActivityFragment secondFragment = (Main2ActivityFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
            if(secondFragment != null) {
                secondFragment.cambiarTexto(texto);
            }
    }

}




