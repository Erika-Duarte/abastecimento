package br.unigran.abastecimento.abastecimento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import br.unigran.abastecimento.R;
import br.unigran.abastecimento.bancoDados.CadastroDB;
import br.unigran.abastecimento.bancoDados.DBHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
