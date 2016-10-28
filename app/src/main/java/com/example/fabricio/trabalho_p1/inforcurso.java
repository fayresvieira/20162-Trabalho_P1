package com.example.fabricio.trabalho_p1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inforcurso extends Activity {

    Button botaoMudarCadastro;
    Button botaoMudarProgresso;
    Button botaoSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infocurso);

        botaoMudarCadastro = (Button) findViewById(R.id.btnCadastro);
        botaoMudarProgresso = (Button) findViewById(R.id.btnProgresso);
        botaoSair = (Button) findViewById(R.id.btnSair);

        botaoMudarCadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent trocadorTela = new Intent(Inforcurso.this, Cadastro.class);
                startActivity(trocadorTela);

            }

        });


        botaoMudarProgresso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent trocadorTela = new Intent(Inforcurso.this, Progresso.class);
                startActivity(trocadorTela);

            }

        });

        botaoSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sair = new Intent(Inforcurso.this,LoginActivity.class);
                startActivity(sair);
            }
        });

    }

}