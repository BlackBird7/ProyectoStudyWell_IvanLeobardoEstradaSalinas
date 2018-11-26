package com.ittepic.pl_prueba_ivanleobardoestradasalinas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;

public class preguntas extends AppCompatActivity {
    TextView titulo,pregunta;
    RadioButton btn1,btn2,btn3;
    ProgressBar barrita;
    Button sig,atr;
    String T="Pregunta #";
    Integer I=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);

        titulo=findViewById(R.id.titulo);
        pregunta=findViewById(R.id.pregunta);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        barrita=findViewById(R.id.barra);
        sig=findViewById(R.id.Siguiente);
        atr=findViewById(R.id.Anterior);

        titulo.setText("Pregunta #"+I);

        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //atr.setEnabled(true);
                /*atr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        I--;
                        titulo.setText("Pregunta #"+I);
                    }
                });*/
                if (I<10){
                    I++;
                    titulo.setText("Pregunta #" + I);
                    siguientePregunta();
                }else{
                    ventana2();
                }
            }
        });

    }
    public void siguientePregunta (){
        String P;
        boolean resp;

        P=null;

        pregunta.setText(""+P);

    }
    public void ventana2 (){
        Intent ventana2 = new Intent(preguntas.this, segundaParte.class);
        startActivity(ventana2);
    }
}
