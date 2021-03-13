package com.example.quizeco1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonRegistro;
    private TextView titulo, lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRegistro = findViewById(R.id.buttonRegistro);
        titulo = findViewById(R.id.titulo);
        lista = findViewById(R.id.lista);

        buttonRegistro.setOnClickListener(
                (v)->{
                    Intent i = new Intent (this,Registro.class);
                    startActivity(i);
                }
        );

    }
}