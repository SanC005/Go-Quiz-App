package com.example.quizy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuestionTwo extends AppCompatActivity {

    int localScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        Button button = findViewById(R.id.next);


        RadioButton radioButtonOne = findViewById(R.id.radioButton);
        RadioButton radioButtonTwo = findViewById(R.id.radioButton2);
        RadioButton radioButtonThree = findViewById(R.id.radioButton3);
        RadioButton radioButtonFour = findViewById(R.id.radioButton4);

        if (radioButtonOne.isActivated()) {
            decrement();
        } else {

        }


        if (radioButtonTwo.isChecked()) {
            increment();
        }

        if (radioButtonThree.isChecked()) {
            increment();
        }
        if (radioButtonFour.isChecked()) {
            increment();
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Score.score += localScore;
                Toast.makeText(getApplicationContext(), "Hellow", Toast.LENGTH_LONG).show();

                startActivity(new Intent(view.getContext(), QuestionThree.class));
            }
        });
    }

    private void increment() {
        localScore++;

        Toast.makeText(getApplicationContext(), String.valueOf(localScore), Toast.LENGTH_SHORT).show();
    }

    private void decrement() {
        if (localScore > 0){
            localScore--;
            Toast.makeText(getApplicationContext(), String.valueOf(localScore), Toast.LENGTH_SHORT).show();


        }

    }
}