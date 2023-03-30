package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view) {
        List<String> nomes = Arrays.asList("João", "Maria", "José", "Antônio", "Mariana", "Pedro", "Rafaela", "Fernanda", "Lucas", "Carla");
        Random random = new Random();
        int index = random.nextInt(nomes.size());
        TextView txttitulo = findViewById(R.id.txtTitulo);
        txttitulo.setText("Olá " + nomes.get(index) + ", seja muito bem vindo(a)");
    }

    public void sortearNumero(View view) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(11); // 0 a 10
        TextView txtsortear = findViewById(R.id.txtSorteado);
        txtsortear.setText("O número sorteado é: "+ numeroAleatorio);

    }

}