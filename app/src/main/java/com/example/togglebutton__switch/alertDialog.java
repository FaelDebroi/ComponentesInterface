package com.example.togglebutton__switch;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

public class alertDialog extends AppCompatActivity {
    private Switch SwitcObriga;
    private ProgressBar PBCircular;
    private ProgressBar PBHorizontal;
    private int progreco = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        SwitcObriga = findViewById(R.id.switchObrigatorio);
        PBHorizontal = findViewById(R.id.progressBarHorizontal);
        PBCircular = findViewById(R.id.progressBarCircular);

        PBCircular.setVisibility(View.GONE);//ele Defini a opcao GONE que nao vai mostrar
    }

    public void progressBar(View view){

        //progressBar horizontal
        this.progreco = this.progreco + 1;
        PBHorizontal.setProgress(this.progreco);
        PBCircular.setVisibility(View.VISIBLE);//ele Defini a opcao VISIBLE que vai mostrar
        if(progreco >= 10){
            Toast.makeText(this, "VOce completou o ciclo !!!", Toast.LENGTH_SHORT).show();
            PBCircular.setVisibility(View.GONE); //ele Defini a opcao GONE que nao vai mostrar
        }
    }

    public void mudarTela(View view){
        Intent intent = new Intent(this, Seekbar.class);
        startActivity(intent);
    }

    public void alertDialog(View view){
        //Instanciar alertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configurar titulo da Mensagem
        dialog.setTitle("Titulo de Dialog");
        dialog.setMessage("Menssagem do Dialog");

        //Configuracao de cancelamento- o usuario tem que Responder a tela
        if(SwitcObriga.isChecked()){
        dialog.setCancelable(false);
        }else{
         dialog.setCancelable(true);
        }

        //Configurar icon
        dialog.setIcon(android.R.drawable.ic_dialog_alert);

        //Configurar acoes para sim e nao
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(alertDialog.this, "voce Selecionou Sim", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(alertDialog.this, "voce Selecionou Não", Toast.LENGTH_SHORT).show();
            }
        });

        // criar e exibir AlertDialog
        dialog.create();
        dialog.show();

    }
}