package com.example.fabricio.trabalho_p1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        botaoMudarTela.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent trocadorTela = new Intent(LoginActivity.this, infocurso.class);
                startActivity(trocadorTela);

            }

        });
    }

}