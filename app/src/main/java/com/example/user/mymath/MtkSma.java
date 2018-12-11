package com.example.user.mymath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.View.OnClickListener;

public class MtkSma extends AppCompatActivity implements View.OnClickListener{

    private CardView Logaritma,Irisan,Statistika,Polinomial,Vektor,Trigonometri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtk_sma);

        //Definning sma
        Logaritma = (CardView) findViewById(R.id.logaritma);
        Irisan = (CardView) findViewById(R.id.irisan);
        Statistika = (CardView) findViewById(R.id.statistika);
        Polinomial = (CardView) findViewById(R.id.polinomial);
        Vektor = (CardView) findViewById(R.id.vektor);
        Trigonometri = (CardView) findViewById(R.id.trigonometri);

        Logaritma.setOnClickListener(this);
        Irisan.setOnClickListener(this);
        Statistika.setOnClickListener(this);
        Polinomial.setOnClickListener(this);
        Vektor.setOnClickListener(this);
        Trigonometri.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i ;

        switch (view.getId()){
            case R.id.logaritma : i = new Intent(this,Logaritma3.class); startActivity(i); break;
            case R.id.irisan : i = new Intent(this,Irisan3.class); startActivity(i); break;
            case R.id.statistika : i = new Intent(this,Statistika3.class); startActivity(i); break;
            case R.id.polinomial : i = new Intent(this,Polinomial3.class); startActivity(i); break;
            case R.id.vektor : i = new Intent(this,Vektor3.class); startActivity(i); break;
            case R.id.trigonometri : i = new Intent(this,Trigonometri3.class); startActivity(i); break;
            default : break;

        }


    }
}
