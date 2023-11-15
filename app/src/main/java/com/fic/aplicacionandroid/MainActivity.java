package com.fic.aplicacionandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String MAIN_ACTIVIY_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnIniciarActividad = findViewById(R.id.btnIniciarActividad);

        btnIniciarActividad.setOnClickListener(accionIniciarActividad);
    }

    public View.OnClickListener accionIniciarActividad = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencionMostrarActividad = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intencionMostrarActividad);
                escribirlog("Click en el botón iniciar actividad");
            }
    };

    public void escribirlog(String texto) {
        Log.d(MAIN_ACTIVIY_TAG, texto);
    }
}