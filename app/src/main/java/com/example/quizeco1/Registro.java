package com.example.quizeco1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    private Button buttonContinuar;
    private TextView instruccionesRegistro, tituloRegistro;
    private EditText identificacion, nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        buttonContinuar = findViewById(R.id.buttonContinuar);
        instruccionesRegistro = findViewById(R.id.instruccionesRegistro);
        tituloRegistro = findViewById(R.id.tituloRegistro);
        identificacion = findViewById(R.id.identificacion);
        nombre = findViewById(R.id.nombre);

        buttonContinuar.setOnClickListener(
                (v)-> {
                    String username = nombre.getText().toString();
                    String id = identificacion.getText().toString();
                }
        );

    }
}