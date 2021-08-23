package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resposta extends AppCompatActivity {
    static String texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);
        defineTexto();
    }
    public void defineTexto(){
        TextView resultado = (TextView) findViewById(R.id.textView);
        resultado.setText(texto);
    }
}