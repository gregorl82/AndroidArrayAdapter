package com.example.triviacategorylister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class QuestionActivity extends AppCompatActivity {

    private Question question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        String questionText = "Which country will host the 2020 Summer Olympics?";
        String correctAnswer = "Japan";
        ArrayList<String> incorrectAnswers = new ArrayList<>();
        incorrectAnswers.add("Germany");
        incorrectAnswers.add("China");
        incorrectAnswers.add("Australia");

        question = new Question(questionText, correctAnswer, incorrectAnswers);

        TextView questionTextView = findViewById(R.id.question_text);
        questionTextView.setText(question.getQuestionText());

        ArrayList<String> answerArray = question.getAllAnswers();
        TextView answerATextView = findViewById(R.id.answer_a);
        answerATextView.setText(answerArray.get(0));

        TextView answerBTextView = findViewById(R.id.answer_b);
        answerBTextView.setText(answerArray.get(1));

        TextView answerCTextView = findViewById(R.id.answer_c);
        answerCTextView.setText(answerArray.get(2));

        TextView answerDTextView = findViewById(R.id.answer_d);
        answerDTextView.setText(answerArray.get(3));

    }


}
