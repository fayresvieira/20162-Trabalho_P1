package com.example.fabricio.trabalho_p1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Progresso extends Activity {

    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresso);

        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Progresso.this.finish(); // com isso a segunda tela volta para a tela de onde ela foi chamada.

            }
        });

    }

}
