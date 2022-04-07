package com.mycompany.quizgame;

public class Choices {
    
    private String choice;
    
    private boolean isAnswer;

    public Choices(String choice) {
        this.choice = choice;
        this.isAnswer = false;
    }

    public Choices(String choice, boolean isAnswer) {
        this.choice = choice;
        this.isAnswer = isAnswer;
    }
  

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public boolean isAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(boolean isAnswer) {
        this.isAnswer = isAnswer;
    }
}


