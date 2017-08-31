package com.example.elitesmatiasjr.gradecomputation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText quiz1_field;
    EditText quiz2_field;
    EditText seatwork_field;
    EditText lab_field;
    EditText exam_field;
    Button btnCompute;

    double ra;
    String ra_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quiz1_field       = (EditText) findViewById(R.id.quiz1_field);
        quiz2_field       = (EditText) findViewById(R.id.quiz2_field);
        seatwork_field    = (EditText) findViewById(R.id.seatwork_field);
        lab_field         = (EditText) findViewById(R.id.lab_field);
        exam_field        = (EditText) findViewById(R.id.exam_field);
        btnCompute        = (Button) findViewById(R.id.btnCompute);
    }

    public void callSecondActivity (View view){

        double quiz1    = Double.parseDouble(quiz1_field.getText().toString());
        double quiz2    = Double.parseDouble(quiz2_field.getText().toString());
        double seatwork = Double.parseDouble(seatwork_field.getText().toString());
        double lab      = Double.parseDouble(lab_field.getText().toString());
        double exam     = Double.parseDouble(exam_field.getText().toString());

        ra      = (quiz1 * 0.1) + (quiz2 * 0.1) + (seatwork * 0.1) + (lab * 0.4) + (exam * 0.3);
        ra_text = Double.toString(ra);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("ra_text", ra_text);
        startActivity(intent);
    }
}
