package com.example.quizeco1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;

public class NexoEp extends AppCompatActivity {

    private CheckBox checkBox1, checkBox2, checkBox3,checkBox4, checkBox5;
    private Button buttonContinuar2;
    private String usuario, id;
    private int puntajeRiesgo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nexo_ep);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        buttonContinuar2 = findViewById(R.id.buttonContinuar2);

        usuario = getIntent().getExtras().getString("usuario");
        id = getIntent().getExtras().getString("id");


        buttonContinuar2.setOnClickListener(
                (v)-> {

                    puntaje();

                    if (checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked() || checkBox5.isChecked() ){

                        Intent a = new Intent(this,Sintomas.class);
                        a.putExtra ("usuario", usuario);
                        a.putExtra("id",id);
                        a.putExtra("puntajeRiesgo",puntajeRiesgo);
                        startActivity(a);
                    }
                }
        );
    }

    public void puntaje(){
        if(checkBox1.isChecked()){
            puntajeRiesgo +=3;
        }
        if(checkBox2.isChecked()){
            puntajeRiesgo +=3;
        }
        if(checkBox3.isChecked()){
            puntajeRiesgo +=3;
        }
        if(checkBox4.isChecked()){
            puntajeRiesgo +=3;
        }
        if(checkBox5.isChecked()){
            puntajeRiesgo =0;
        }
    }
}