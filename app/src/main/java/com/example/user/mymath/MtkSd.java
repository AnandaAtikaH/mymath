package com.example.user.mymath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MtkSd extends AppCompatActivity implements View.OnClickListener {
    private CardView bangunruang,operasihitung,Kpk,Pecahan,Volume,Pengukuran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtk_sd);

        //defining sd
        bangunruang = (CardView) findViewById(R.id.bangun_ruang);
        operasihitung = (CardView) findViewById(R.id.operasi_hitung);
        Kpk = (CardView) findViewById(R.id.kpk);
        Pecahan = (CardView) findViewById(R.id.pecahan);
        Volume = (CardView) findViewById(R.id.volume);
        Pengukuran = (CardView) findViewById(R.id.pengukuran);

        //add clicklistener to the sd
        bangunruang.setOnClickListener(this);
        operasihitung.setOnClickListener(this);
        Kpk.setOnClickListener(this);
        Pecahan.setOnClickListener(this);
        Volume.setOnClickListener(this);
        Pengukuran.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i ;

        switch (view.getId()) {
            case R.id.bangun_ruang : i = new Intent(this,BangunRuang.class); startActivity(i); break;
            case R.id.operasi_hitung : i = new Intent(this,OperasiHitung.class); startActivity(i); break;
            case R.id.kpk : i = new Intent(this,KPK.class); startActivity(i); break;
            case R.id.pecahan : i = new Intent(this,PECAHAN.class); startActivity(i); break;
            case R.id.volume : i = new Intent(this,Volume2.class); startActivity(i); break;
            case R.id.pengukuran : i = new Intent(this,Pecahan2.class); startActivity(i); break;
            default:break;
        }
    }
}
