package com.example.quizy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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


//        CheckBox Button1 = findViewById(R.id.checkBox);
//        CheckBox Button2 = findViewById(R.id.checkBox2);
        CheckBox Button3 = findViewById(R.id.checkBox3);
        CheckBox Button4 = findViewById(R.id.checkBox4);


//        if (Button4.isChecked()) {
//            increment();
//        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Button3.isChecked() && Button4.isChecked()) {
                    Score.score++;

                }

//                Toast.makeText(getApplicationContext(), "Hellow", Toast.LENGTH_LONG).show();

                startActivity(new Intent(view.getContext(), QuestionThree.class));
            }
        });
    }
}
//    private void increment() {
//        localScore++;
//
//        Toast.makeText(getApplicationContext(), String.valueOf(localScore), Toast.LENGTH_SHORT).show();
//    }

//    private void decrement() {
//        if (localScore > 0){
//            localScore--;
//            Toast.makeText(getApplicationContext(), String.valueOf(localScore), Toast.LENGTH_SHORT).show();
//
//
//        }
//
//    }
