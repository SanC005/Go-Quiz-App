package com.example.quizy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionFour extends AppCompatActivity {

    private Button eagle;
    private  Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);

        eagle = findViewById(R.id.eagle);
        eagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Score.score++;
            }
        });


        next = findViewById(R.id.nextfour);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(view.getContext(),QuestionFive.class));

            }
        });
    }
}