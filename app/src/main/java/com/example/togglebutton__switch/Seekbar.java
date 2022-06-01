package com.example.togglebutton__switch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Seekbar extends AppCompatActivity {

    private SeekBar seekBarEscala;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        seekBarEscala= findViewById(R.id.seekBar);
        Resultado = findViewById(R.id.Resultado);

        seekBarEscala.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //a cada mudanca de progresso esse metodo e chamado
                Resultado.setText("o progresso é de "+i +"/"+seekBar.getMax());
                //seekBar.getMax() ele retorna o valor colocado no MAX
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //quando voce click em cima do progresso ele ativa esse metodo

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //quando voce click e solta ele ativa esse metodo

            }
        });


    }

    public void SeekBar(View view){
    Resultado.setText("Resultado: "+seekBarEscala.getProgress());
       //seekBarEscala.getProgress() ele retorna o progresso
    }
}