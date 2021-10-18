package com.project.graduatepj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class BloodCollect2 extends AppCompatActivity {
<<<<<<< HEAD
    Intent intent = new Intent();
//
//    {
//        intent = new Intent();
//    }
=======

    Intent intent;

    public BloodCollect2() {
        intent = new Intent();
    }
>>>>>>> 10eb8ededc5ac5c33cba57620f8893dee2ef7994

    TextView tv1, tv2, tv3, tv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_collect2);

        Bundle patientNumber1Check = this.getIntent().getExtras();
        Bundle sampleNumberCheck = this.getIntent().getExtras();
        Bundle collectorNumberCheck = this.getIntent().getExtras();
        Bundle recheckNumberCheck = this.getIntent().getExtras();

        String patientNumber1 = patientNumber1Check.getString("patientNumber1Check");
        String sampleNumber = sampleNumberCheck.getString("sampleNumberCheck");
        String collectorNumber = collectorNumberCheck.getString("collectorNumberCheck");
        String recheckNumber = recheckNumberCheck.getString("recheckNumberCheck");

        tv1 = (TextView) findViewById(R.id.patientNumber1Box);
        tv2 = (TextView) findViewById(R.id.sampleNumberBox);
        tv3 = (TextView) findViewById(R.id.collectorNumberBox);
        tv4 = (TextView) findViewById(R.id.recheckNumberBox);

        tv1.setText(patientNumber1);
        tv2.setText(sampleNumber);
        tv3.setText(collectorNumber);
        tv4.setText(recheckNumber);

        Button bt = (Button) findViewById(R.id.nextbt);
        Button bt2 = (Button) findViewById(R.id.frontbt);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BloodCollect2.this, examine_homePage.class);
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BloodCollect2.this, BloodCollect1.class);
                startActivity(intent);
            }
        });


    }
}
