package com.vilela.jordana.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView visor;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visor = findViewById(R.id.numero);
    }

    void incrementa (View view){
        int numero = Integer.parseInt((visor.getText().toString()));
        visor.setText(Integer.toString(numero+1));
        visor.setBackgroundColor(Color.BLUE); //cor azul
    }

    void decrementa (View view){
        int numero = Integer.parseInt((visor.getText().toString()));
        visor.setText(Integer.toString(numero-1));
        visor.setBackgroundColor(Color.RED); //cor cor vermelho


    }

    void zera (View view){
        visor.setText("0");
        visor.setBackgroundColor(Color.GREEN); //cor verde
    }
}
