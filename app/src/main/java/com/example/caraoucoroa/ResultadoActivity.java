package com.example.caraoucoroa;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.caraoucoroa.databinding.ActivityResultadoBinding;

public class ResultadoActivity extends AppCompatActivity {

  private ActivityResultadoBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityResultadoBinding.inflate(getLayoutInflater());
    View view = binding.getRoot();
    setContentView(view);

    //Recuperar dados
    Bundle dados = getIntent().getExtras();
    int numero = dados.getInt("numero");

    if (numero == 0) {//cara
      binding.imageResultado.setImageResource(R.drawable.moeda_cara);
    } else {//coroa
      binding.imageResultado.setImageResource(R.drawable.moeda_coroa);
    }

    binding.buttonVoltar.setOnClickListener(v -> {
      finish();
    });
  }
}