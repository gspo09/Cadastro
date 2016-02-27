package br.com.trainning.cadastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    TextView textviewNome;
    TextView textviewIdade;
    TextView textviewTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String idade = intent.getStringExtra("idade");
        String telefone = intent.getStringExtra("telefone");

        textviewNome = (TextView) findViewById(R.id.textviewNome);
        textviewIdade = (TextView) findViewById(R.id.textviewIdade);
        textviewTelefone = (TextView)findViewById(R.id.textviewTelefone);

        textviewNome.setText(nome);
        textviewIdade.setText(idade);
        textviewTelefone.setText(telefone);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag,"onRestart");

}
