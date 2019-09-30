package com.mediomelon.estilosbotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnPrimario,btnSecundario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrimario= findViewById(R.id.btnPrimarioDeshabilitado);
        btnSecundario = findViewById(R.id.btnSecundarioDeshabilitado);

        btnPrimario.setEnabled(false);
        btnSecundario.setEnabled(false);
    }
}
