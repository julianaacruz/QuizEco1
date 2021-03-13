package com.example.quizeco1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class Sintomas extends AppCompatActivity {


    private CheckBox checkBox6, checkBox7, checkBox8,checkBox9, checkBox10, checkBox11, checkBox12;
    private Button buttonFin;
    private String usuario, id;
    private int puntajeRiesgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas);

        checkBox6 = findViewById(R.id.checkBox6);
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        checkBox9 = findViewById(R.id.checkBox9);
        checkBox10 = findViewById(R.id.checkBox10);
        checkBox11 = findViewById(R.id.checkBox11);
        checkBox12 = findViewById(R.id.checkBox12);
        buttonFin = findViewById(R.id.buttonFin);

        usuario = getIntent().getExtras().getString("usuario");
        id = getIntent().getExtras().getString("id");
        puntajeRiesgo = getIntent().getExtras().getInt("puntajeRiesgo");

        buttonFin.setOnClickListener(
                (v)-> {

                    puntaje();

                    if (checkBox6.isChecked() || checkBox7.isChecked() || checkBox8.isChecked() || checkBox9.isChecked() || checkBox10.isChecked() || checkBox11.isChecked() || checkBox12.isChecked() ){

                        Intent b = new Intent(this,MainActivity.class);
                        saveData();
                        startActivity(b);
                        finish();
                    }
                }
        );
    }

    public void puntaje(){
        if(checkBox6.isChecked()){
            puntajeRiesgo +=4;
        }
        if(checkBox7.isChecked()){
            puntajeRiesgo +=4;
        }
        if(checkBox8.isChecked()){
            puntajeRiesgo +=4;
        }
        if(checkBox9.isChecked()){
            puntajeRiesgo +=4;
        }
        if(checkBox10.isChecked()){
            puntajeRiesgo +=4;
        }
        if(checkBox11.isChecked()){ //Ninguno
            puntajeRiesgo +=0;
        }
        if(checkBox12.isChecked()){
            puntajeRiesgo +=4;
        }
    }

    public void saveData(){
        SharedPreferences preferences = getSharedPreferences("datos", MODE_PRIVATE);
        String loQueYaEstaba = preferences.getString("usuarios", "");
        String user= usuario + ", " + id + ", " + puntajeRiesgo + "\n";
        preferences.edit().putString("usuarios", loQueYaEstaba + user).apply();
    }
}