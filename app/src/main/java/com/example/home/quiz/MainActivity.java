package com.example.home.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*Instead of hard coded the string to check answer in EditText,
      this variable stores the answer from strings.xml. It is initialized in onCreate(). */
    String answer_7;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer_7 = getString(R.string.q7_choice_1);
    }

    /**
     * This method finds the total score obtained in the quiz.
     * It checks each question one by one.
     */
    public void findScore(View view) {
        score = 0;
        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        checkQuestion5();
        checkQuestion6();
        checkQuestion7();
        Toast.makeText(this, "You got " + score + " out of " + "7 correctly.", Toast.LENGTH_SHORT).show();

    }

    /**
     * This method checks the first question, and updates the score.
     */
    public void checkQuestion1() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.q1_radio_buttons);
        int selected = rg.getCheckedRadioButtonId();
        if (selected == R.id.q1_radio_button_1) {
            score += 1;
        } else {
            score += 0;
        }
    }

    /**
     * This method checks the second question, and updates the score.
     */
    public void checkQuestion2() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.q2_radio_buttons);
        int selected = rg.getCheckedRadioButtonId();
        if (selected == R.id.q2_radio_button_2) {
            score += 1;
        }
    }

    /**
     * This method checks the third question, and updates the score.
     */
    public void checkQuestion3() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.q3_radio_buttons);
        int selected = rg.getCheckedRadioButtonId();
        if (selected == R.id.q3_radio_button_3) {
            score += 1;
        }
    }

    /**
     * This method checks the fourth question, and updates the score.
     */
    public void checkQuestion4() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.q4_radio_buttons);
        int selected = rg.getCheckedRadioButtonId();
        if (selected == R.id.q4_radio_button_4) {
            score += 1;
        }
    }

    /**
     * This method checks the fifth question, and updates the score.
     */
    public void checkQuestion5() {
        RadioGroup rg = (RadioGroup) findViewById(R.id.q5_radio_buttons);
        int selected = rg.getCheckedRadioButtonId();
        if (selected == R.id.q5_radio_button_3) {
            score += 1;
        }
    }

    /**
     * This method checks the sixth question, and updates the score.
     */
    public void checkQuestion6() {
        CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);

        if (cb1.isChecked() && !cb2.isChecked() && cb3.isChecked() && !cb4.isChecked()) {
            score += 1;
        }
    }

    /**
     * This method checks the seventh question, and updates the score.
     */
    public void checkQuestion7() {
        EditText ed = (EditText) findViewById(R.id.editText_7);
        String answer = (ed.getText()).toString();
        if (answer.trim().equals(answer_7)) {
            score += 1;
        }
    }
}
