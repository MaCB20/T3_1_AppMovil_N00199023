package com.example.t3_1_appmovil_n00199023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1, tv2;

    int suma = 0;
    int resta = 0;
    float division = 0.0f;
    int multiplicacion = 0;

    String operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

    }

    public void sumar(View v){

        operador = "+";

        tv1.setText("SUMA");

        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();

        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);

        suma = v1 + v2;

    }

    public void restar(View v){

        operador = "-";

        tv1.setText("RESTA");

        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();

        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);

        resta = v1 - v2;

    }

    public void dividir(View v){

        operador = "/";

        tv1.setText("DIVISION");

        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();

        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);

        division = v1 / v2;

    }

    public void multiplicar(View v){

        operador = "*";

        tv1.setText("MULTIPLICACION");

        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();

        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);

        multiplicacion = v1 * v2;

    }

    public void igualar(View v)
    {
        if(operador == "+"){
            tv2.setText("La suma es: " +suma);
        }
        if(operador == "-"){
            tv2.setText("La resta es: " +resta);
        }
        if(operador == "/"){
            tv2.setText("La división es: " +division);
        }
        if(operador == "*"){
            tv2.setText("El producto es: " +multiplicacion);
        }
    }

}