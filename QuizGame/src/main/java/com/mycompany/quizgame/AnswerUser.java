package com.mycompany.quizgame;

public class AnswerUser {
    
    private String answer;
    
    private int choiceNumber;

    public AnswerUser(String answer, int choiceNumber) {
        this.answer = answer;
        this.choiceNumber = choiceNumber;
    }
    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getChoiceNumber() {
        return choiceNumber;
    }

    public void setChoiceNumber(int choiceNumber) {
        this.choiceNumber = choiceNumber;
    }

    @Override
    public String toString() {
        return "UserAnswer{" + "answer=" + answer + ", choiceNumber=" + choiceNumber + '}';
    }
    
    
}

