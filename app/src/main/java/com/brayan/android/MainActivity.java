package com.brayan.android;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btncero, btnuno, btndos, btntres, btncuatro, btncinco, btnseis, btnsiete, btnocho,
            btnnueve, btnigual, btnsuma, btnresta, btnmulti, btnporcentaje, btndiv, btnlimpiar;
    TextView etconcatenar, resultadofinal;
    double numero1, numero2, resultado, total;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncero = findViewById(R.id.cero);
        btnuno =  findViewById(R.id.uno);
        btndos = findViewById(R.id.dos);
        btntres =  findViewById(R.id.tres);
        btncuatro =  findViewById(R.id.cuatro);
        btncinco = findViewById(R.id.cinco);
        btnseis =  findViewById(R.id.seis);
        btnsiete =  findViewById(R.id.siete);
        btnocho = findViewById(R.id.ocho);
        btnnueve =  findViewById(R.id.nueve);
        btnsuma =  findViewById(R.id.mas);
        btnresta =  findViewById(R.id.menos);
        btnmulti =  findViewById(R.id.multiplicar);
        btndiv =  findViewById(R.id.dividir);
        btnporcentaje =  findViewById(R.id.porcentaje);
        btnigual =  findViewById(R.id.resultado);
        resultadofinal =  findViewById(R.id.resultadofinal);

        btnlimpiar = findViewById(R.id.btnlimpiar);
        resultadofinal = findViewById(R.id.resultadofinal);



        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = findViewById(R.id.resultadofinal);
                resultadofinal.setText(etconcatenar.getText().toString() + "3");
            }
        });
    }

    public void PressButton(View view) {

        switch (view.getId()){
            case R.id.btnlimpiar:
                Button b= (Button) view;

                TextView tt= (TextView) findViewById(R.id.resultadofinal);
                tt.setText("vales kk, al chile");
                break;




                
        }

    }
}