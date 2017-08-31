package com.example.elitesmatiasjr.gradecomputation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv_ra;
    TextView tv_final;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_ra    = (TextView) findViewById(R.id.tv_ra);
        tv_final = (TextView) findViewById(R.id.tv_final);
        btnBack  = (Button) findViewById(R.id.btnBack);

        String fgrade_equiv;

        String ave = getIntent().getStringExtra("ra_text");
        tv_ra.setText("Your RA is " + ave);

        double fgrade = Double.parseDouble(ave);

        if (fgrade < 60) {
            fgrade_equiv = "Failed";
            tv_final.setText("Your Final Grade is " + fgrade_equiv);
        } else if (fgrade > 60 && fgrade < 65) {
            fgrade_equiv = "3.0";
            tv_final.setText("Your Final Grade is " + fgrade_equiv);
        } else if (fgrade > 65 && fgrade < 70) {
            fgrade_equiv = "2.75";
            tv_final.setText("Your Final Grade is " + fgrade_equiv);
        } else if (fgrade > 70 && fgrade < 75) {
            fgrade_equiv = "2.5";
            tv_final.setText("Your Final Grade is " + fgrade_equiv);
        } else if (fgrade > 75 && fgrade < 80) {
            fgrade_equiv = "2.25";
            tv_final.setText("Your Final Grade is " + fgrade_equiv);
        } else if (fgrade > 80 && fgrade < 85) {
            fgrade_equiv = "2.0";
            tv_final.setText("Your Final Grade is " + fgrade_equiv);
        } else if (fgrade > 85 && fgrade < 90) {
            fgrade_equiv = "1.75";
            tv_final.setText("Your Final Grade is " + fgrade_equiv);
        } else if (fgrade > 90 && fgrade < 92) {
            fgrade_equiv = "1.5";
            tv_final.setText("Your Final Grade is " + fgrade_equiv);
        } else if (fgrade > 92 && fgrade < 94) {
            fgrade_equiv = "1.25";
            tv_final.setText("Your Final Grade is " + fgrade_equiv);
        } else if (fgrade > 94 && fgrade < 100) {
            fgrade_equiv = "1.0";
            tv_final.setText("Your Final Grade is " + fgrade_equiv);
        } else if (fgrade == 100) {
            fgrade_equiv = "1.0";
            tv_final.setText("Your Final Grade is " + fgrade_equiv);
        }
    }

    public void goBacktoMain (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
