package com.example.user.mymath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class MyMathFormula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_math_formula);


        Button sd = (Button)findViewById(R.id.btnsd);
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyMathFormula.this,MtkSd.class));
            }
        });


        Button smp = (Button)findViewById(R.id.btnsmp);
        smp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyMathFormula.this,MtkSmp.class));
            }
        });



        Button sma = (Button)findViewById(R.id.btnsma);
        sma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MyMathFormula.this,MtkSma.class));
            }
        });

        Button feedback = (Button)findViewById(R.id.btnsave);
        feedback.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                startActivity(new Intent(MyMathFormula.this,Feedback.class));
            }
        });



    }
}
