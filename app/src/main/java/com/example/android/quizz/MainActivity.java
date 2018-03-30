package com.example.android.quizz;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.quizz.R;

import java.text.NumberFormat;

/**
 * This app displays a quiz about bauhaus school
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitAnswers(View view) {
        int correctAnswers = 0;

        RadioGroup radioGroup1 = findViewById(R.id.radio_group1);
        int answerOne = radioGroup1.getCheckedRadioButtonId();

        RadioGroup radioGroup2 = findViewById(R.id.radio_group2);
        int answerTwo = radioGroup2.getCheckedRadioButtonId();

        RadioGroup radioGroup3 = findViewById(R.id.radio_group3);
        int answerThree = radioGroup3.getCheckedRadioButtonId();

        RadioGroup radioGroup4 = findViewById(R.id.radio_group4);
        int answerFour = radioGroup4.getCheckedRadioButtonId();

        CheckBox CheckBox5a = findViewById(R.id.checkbox_5a);
        boolean checked5a = CheckBox5a.isChecked();

        CheckBox CheckBox5b = findViewById(R.id.checkbox_5b);
        boolean checked5b = CheckBox5b.isChecked();

        CheckBox CheckBox5c = findViewById(R.id.checkbox_5c);
        boolean checked5c = CheckBox5c.isChecked();

        CheckBox CheckBox5d = findViewById(R.id.checkbox_5d);
        boolean checked5d = CheckBox5d.isChecked();

        CheckBox CheckBox5e = findViewById(R.id.checkbox_5e);
        boolean checked5e = CheckBox5e.isChecked();

        EditText answerSix = findViewById(R.id.originCity_input_view6);
        String rightAnswer6 = answerSix.getText().toString();

        RadioGroup radioGroup7 = findViewById(R.id.radio_group7);
        int answerSeven = radioGroup7.getCheckedRadioButtonId();

        RadioGroup radioGroup8 = findViewById(R.id.radio_group8);
        int answerEight = radioGroup8.getCheckedRadioButtonId();

        if (answerOne == R.id.radio_1a) {
            correctAnswers++;
        }

        if (answerTwo == R.id.radio_2a) {
            correctAnswers++;
        }

        if (answerThree == R.id.radio_3b) {
            correctAnswers++;
        }

        if (answerFour == R.id.radio_4b) {
            correctAnswers++;
        }

        if (checked5b && checked5c && checked5e && !checked5a && !checked5d) {
            correctAnswers++;
        }

        if (rightAnswer6.equalsIgnoreCase("Weimar")) {
            correctAnswers++;
        }

        if (answerSeven == R.id.radio_7b) {
            correctAnswers++;
        }

        if (answerEight == R.id.radio_8a) {
            correctAnswers++;
        }

        String resultMessage = "";

        if (correctAnswers < 4) {
            resultMessage = correctAnswers + " of 8. Bauhaus what?";
        } else if (correctAnswers <= 6) {
            resultMessage = correctAnswers + " of 8. You might have heard of Bauhaus";
        } else if (correctAnswers <= 8) {
            resultMessage = correctAnswers + " of 8. You are a real Bauhäusler!";
        }

        Toast.makeText(this, resultMessage, Toast.LENGTH_SHORT).show();
    }
}