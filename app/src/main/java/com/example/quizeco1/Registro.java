package com.example.quizeco1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    private Button buttonContinuar;
    private TextView instruccionesRegistro, tituloRegistro;
    private EditText identificacion, nombre;
    private boolean vacio;

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
                    boolean vacio = nombre.getText().toString().isEmpty() || identificacion.getText().toString().isEmpty();

                    if (vacio){
                        Log.e(">>>", ""+vacio);
                    }else{
                    String usuario = nombre.getText().toString();
                    String id = identificacion.getText().toString();

                        Intent x = new Intent(this,NexoEp.class);
                        x.putExtra ("usuario", usuario);
                        x.putExtra("id",id);
                        startActivity(x);
                    }
                }
        );

    }

    public void saveData(){
        SharedPreferences preferences = getSharedPreferences("data", MODE_PRIVATE);
    }
}