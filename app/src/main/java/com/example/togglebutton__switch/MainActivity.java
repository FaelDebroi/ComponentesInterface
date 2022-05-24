package com.example.togglebutton__switch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        resultado = findViewById(R.id.resultados);
    }

    public void enviar(View view){
        String textoSwitch;


        if(switchSenha.isChecked()){
            textoSwitch = "esta ligado o Switch";
        }else{
            textoSwitch = "esta Desligado o Switch";
        }

        if(toggleSenha.isChecked()){
            resultado.setText("esta ligado o Toggle"+"\n"+textoSwitch);
            starOn();
        }else{
            resultado.setText("esta Desligado o Toggle" +"\n"+ textoSwitch);
            starOff();
        }
    }
        // colocando uma imagem no toast
    public void starOn(){
        ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource(android.R.drawable.star_big_on);
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(imagem);
        toast.show();
    }
    public void starOff(){
        ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource(android.R.drawable.star_big_off);
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(imagem);
        toast.show();
    }


}