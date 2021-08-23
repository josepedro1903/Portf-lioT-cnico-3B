package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String perguntaAtual;
    String respostaAtual;
    int contP = 1;
    int contR = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atualizaPerguntas();
    }
    public void atualizaPerguntas(){
        String pergunta1 = "O que é branco?";
        String resposta1 = "todas as cores juntas";
        String pergunta2 = "De quem os bês gostam mais?";
        String resposta2 = "quadrado";
        String pergunta3 = "Team quadrado ou team batata?";
        String resposta3 = "batata";
        String pergunta4 = "Quem derrubou a internet do Senai?";
        String resposta4 = "Sens";
        String pergunta5 = "Qual a idade do Prof Jackson?";
        String resposta5 = "41";

        if(contP == 1) {
            perguntaAtual = pergunta1;
            respostaAtual = resposta1;
        }
        else if (contP == 2) {
            perguntaAtual = pergunta2;
            respostaAtual = resposta2;
        }
        else if (contP == 3) {
            perguntaAtual = pergunta3;
            respostaAtual = resposta3;
        }
        else if (contP == 4) {
            perguntaAtual = pergunta4;
            respostaAtual = resposta4;
        }
        else if (contP == 5) {
            perguntaAtual = pergunta5;
            respostaAtual = resposta5;
        }
        else{
            exibeResultado();
        }
        TextView pergunta = (TextView)findViewById(R.id.pergunta);
        pergunta.setText(perguntaAtual);
    }
    public void botaoResponder(View view){
        EditText resposta = (EditText) findViewById(R.id.resposta);
        String r = resposta.getText().toString();
        if(r.equals(respostaAtual)){
            Toast.makeText(MainActivity.this,"Você acertou!",Toast.LENGTH_LONG).show();
            contR++;
        }
        contP++;
        atualizaPerguntas();
        resposta.setText(null);
    }

    public void exibeResultado() {
        Resposta.texto = "Você acertou "+contR+ " questões!";
        Intent i = new Intent(this, Resposta.class);
        startActivity(i);
        contR = 0;
        contP = 1;
        atualizaPerguntas();
    }
}