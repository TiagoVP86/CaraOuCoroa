package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.caraoucoroa.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = binding.getRoot();
    setContentView(view);

    binding.buttonJogar.setOnClickListener(v -> {
      Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

      //Passar os dados para a próxima tela
      int numero = new Random().nextInt(2); //0 e 1
      intent.putExtra("numero", numero);

      startActivity(intent);
    });

  }
}