package com.example.quizy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

public class QuestionThree extends AppCompatActivity {

    private MaterialButtonToggleGroup materialButtonToggleGroup;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);
     materialButtonToggleGroup = findViewById(R.id.materialButtonGroup);
     next = findViewById(R.id.nextthree);

     materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
         @Override
         public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
             if(group.getCheckedButtonId() == R.id.False){
                 Score.score++;
               //  Toast.makeText(getApplicationContext(),"Heyyyfds",Toast.LENGTH_SHORT).show();

             }
         }
     });

     next.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             startActivity(new Intent(view.getContext(),QuestionFour.class));

         }
     });

//     materialButtonToggleGroup.setOnClickListener(new View.OnClickListener() {
//         @Override
//         public void onClick(View view) {
//             if(materialButtonToggleGroup.isSingleSelection()){
//                 getCheckedButton();
//             }
//         }
//     });


    }



//    private void getCheckedButton(){
//        int checkButtonid = materialButtonToggleGroup.getCheckedButtonId();
//        System.out.println(checkButtonid);
//        String x = String.valueOf(checkButtonid);
//        Toast.makeText(this, x, Toast.LENGTH_SHORT).show();
//        Log.d(MainActivity.class.getSimpleName(), "getCheckedButton(): " + checkButtonid);
//
//
////        if (checkButtonid == null) {
////            MaterialButton checkedButton = findViewById(checkButtonid);
////            String buttonText = checkedButton.getText().toString();
////            Toast.makeText(this, buttonText, Toast.LENGTH_SHORT).show();
////        }
//
//    }
}