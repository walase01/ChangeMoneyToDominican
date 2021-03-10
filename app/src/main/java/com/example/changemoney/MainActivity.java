package com.example.changemoney;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton USE;
    RadioButton Euro;
    RadioButton LibraEsterlina;
    RadioButton FrancoSuizo;
    RadioButton YenJaponesa;
    RadioButton DolarHong;
    TextView Reultado;
    EditText Valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Conectar();
    }
    public void Conectar(){
        USE = findViewById(R.id.radioButton);
        Euro = findViewById(R.id.radioButton2);
        LibraEsterlina = findViewById(R.id.radioButton3);
        FrancoSuizo = findViewById(R.id.radioButton4);
        YenJaponesa = findViewById(R.id.radioButton5);
        DolarHong = findViewById(R.id.radioButton6);
        Reultado = findViewById(R.id.ResultadoF);
        Valor = findViewById(R.id.Valor1);
    }

    public void Convertir_dom(View dinero){

        if (USE.isChecked()){
            double r = Double.parseDouble(Valor.getText().toString());
            double fin = r * 57.58;
            Reultado.setText("El resultado es: " + Double.toString(fin));
        }
        if (Euro.isChecked()){
            double r = Double.parseDouble(Valor.getText().toString());
            double fin = r * 68.61;
            Reultado.setText("El resultado es: " + Double.toString(fin));
        }
        if (LibraEsterlina.isChecked()){
            double r = Double.parseDouble(Valor.getText().toString());
            double fin = r * 80.22;
            Reultado.setText("El resultado es: " + Double.toString(fin));
        }
        if (FrancoSuizo.isChecked()){
            double r = Double.parseDouble(Valor.getText().toString());
            double fin = r * 62.02;
            Reultado.setText("El resultado es: " + Double.toString(fin));
        }
        if (YenJaponesa.isChecked()){
            double r = Double.parseDouble(Valor.getText().toString());
            double fin = r * 0.53;
            Reultado.setText("El resultado es: " + Double.toString(fin));
        }
        if (DolarHong.isChecked()){
            double r = Double.parseDouble(Valor.getText().toString());
            double fin = r * 7.42;
            Reultado.setText("El resultado es: " + Double.toString(fin));
        }
    }
}