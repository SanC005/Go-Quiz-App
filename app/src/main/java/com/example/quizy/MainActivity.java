package com.example.quizy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.startButton);
//
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Quiz Started",Toast.LENGTH_LONG).show();

                startActivity(new Intent(view.getContext(), QuestionTwo.class));
            }
        });





    }

    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);




    }

    //@Override
//    public void onClick(View view) {
//       if (view.equals(R.id.startButton)){
//
//           Toast.makeText(this, "Heyyy", Toast.LENGTH_SHORT).show();
//           Intent intent = new Intent(view.getContext(),Question2.class);
//           startActivity(intent);
//
//        }
//
//    }
}