package com.ittepic.pl_prueba_ivanleobardoestradasalinas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class segundaParte extends AppCompatActivity {
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_parte);

        //btn4=findViewById(R.id.btn4);

        /*btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pregunta = new Intent(segundaParte.this, preguntas.class);
                startActivity(pregunta);
            }
        });*/
    }
}
