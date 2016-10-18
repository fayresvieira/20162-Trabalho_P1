package com.example.fabricio.trabalho_p1;

import android.os.Bundle;
import android.view.View;

public class progresso extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progresso);


        btnVoltar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                progresso.this.finish(); // com isso a segunda tela volta para a tela de onde ela foi chamada.

            }
        });

    }

}
