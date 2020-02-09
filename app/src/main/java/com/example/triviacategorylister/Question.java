package com.example.triviacategorylister;

import java.util.ArrayList;
import java.util.Random;

public class Question {

    private String mQuestionText;
    private String mCorrectAnswer;
    private ArrayList<String> mIncorrectAnswers;

    public Question(String mQuestionText, String mCorrectAnswer, ArrayList<String> mIncorrectAnswers) {
        this.mQuestionText = mQuestionText;
        this.mCorrectAnswer = mCorrectAnswer;
        this.mIncorrectAnswers = mIncorrectAnswers;
    }

    public String getQuestionText() {
        return mQuestionText;
    }

    public String getCorrectAnswer() {
        return mCorrectAnswer;
    }

    public ArrayList<String> getIncorrectAnswers() {
        return mIncorrectAnswers;
    }

    public ArrayList<String> getAllAnswers(){
        Random rand = new Random();
        int index = rand.nextInt(3);
        ArrayList<String> answers = this.mIncorrectAnswers;
        answers.add(index, this.mCorrectAnswer);
        return answers;
    }
}
