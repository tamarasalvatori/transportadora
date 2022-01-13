package com.example.transportadoraabc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtCombustivel;
    EditText edtQuilometragem;
    TextView txtRelatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCombustivel = findViewById(R.id.editCombustivel);
        edtQuilometragem = findViewById(R.id.editQuilometragem);
        txtRelatorio = findViewById(R.id.textRelatorio);
    }

    public void calcular(View v){
        int consumo = 10;

        double quilometragem = Double.parseDouble(edtQuilometragem.getText().toString());
        double precoCombustivel = Double.parseDouble(edtCombustivel.getText().toString());

        double litrosIda = quilometragem/consumo;

        double resultado = this.creditos(litrosIda, precoCombustivel);

        txtRelatorio.setText(String.format("Crédito necessário - R$: %.2f", resultado));
    }

    public static double creditos(double litros, double preco){
        double dinheiro = litros * preco * 2 * 1.1;
        return dinheiro;
    }
}