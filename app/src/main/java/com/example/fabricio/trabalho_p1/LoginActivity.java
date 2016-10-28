package com.example.fabricio.trabalho_p1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {

    Button botaoMudarTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        botaoMudarTela = (Button) findViewById(R.id.btnMudarTela);
        botaoMudarTela.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent trocadorTela = new Intent(LoginActivity.this, Inforcurso.class);
                startActivity(trocadorTela);

            }

        });
    }

}