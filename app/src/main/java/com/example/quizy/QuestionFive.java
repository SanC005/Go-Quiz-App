package com.example.quizy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionFive extends AppCompatActivity {

    private Button ans;
    private  Button nextt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five);

        ans = findViewById(R.id.pluto);
        nextt = findViewById(R.id.next6);

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Score.score++;
            }
        });

        nextt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(view.getContext(),QuestionSix.class));

            }
        });
    }
}