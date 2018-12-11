package com.example.user.mymath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MtkSmp extends AppCompatActivity implements View.OnClickListener {
    private CardView Aljabar,Linear,Himpunan,Aritmetika,Relasi,Lingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtk_smp);

        //defining smp
        Aljabar = (CardView)findViewById(R.id.aljabar);
        Linear = (CardView)findViewById(R.id.linear);
        Himpunan = (CardView)findViewById(R.id.himpunan);
        Aritmetika = (CardView)findViewById(R.id.aritmetika);
        Relasi = (CardView) findViewById(R.id.relasi);
        Lingkaran = (CardView) findViewById(R.id.lingkaran);


        //add click listener to smp
        Aljabar.setOnClickListener(this);
        Linear.setOnClickListener(this);
        Himpunan.setOnClickListener(this);
        Aritmetika.setOnClickListener(this);
        Relasi.setOnClickListener(this);
        Lingkaran.setOnClickListener(this);
//
    }

    @Override
    public void onClick(View view) {
        Intent i ;

        switch(view.getId()){
            case R.id.aljabar : i = new Intent(this,Aljabar2.class); startActivity(i); break;
            case R.id.linear : i = new Intent(this,Linear2.class); startActivity(i); break;
            case R.id.himpunan : i = new Intent(this,Himpunan2.class); startActivity(i); break;
            case R.id.aritmetika : i = new Intent(this,Aritmetika2.class); startActivity(i); break;
            case R.id.relasi : i = new Intent(this,Relasi2.class); startActivity(i); break;
            case R.id.lingkaran : i = new Intent(this,Lingkaran2.class); startActivity(i); break;
            default:break;

        }

    }
}
