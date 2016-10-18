package com.example.fabricio.trabalho_p1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class infocurso extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infocurso);

        botaoMudarCadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent trocadorTela = new Intent(infocurso.this, cadastro.class);
                startActivity(trocadorTela);

            }

        });


        botaoMudarProgresso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent trocadorTela = new Intent(infocurso.this, progresso.class);
                startActivity(trocadorTela);

            }

        });

    }

}