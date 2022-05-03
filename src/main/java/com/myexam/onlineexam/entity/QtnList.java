package com.myexam.onlineexam.entity;

public class QtnList {

    String qtnName;
    String correctAnswer;

    public QtnList(String qtnName, String correctAnswer) {
        this.qtnName = qtnName;
        this.correctAnswer = correctAnswer;
    }

    public String getQtnName() {
        return qtnName;
    }

    public void setQtnName(String qtnName) {
        this.qtnName = qtnName;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
