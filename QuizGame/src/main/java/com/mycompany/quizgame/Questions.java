package com.mycompany.quizgame;

import java.util.List;

public class Questions {
    
    private int questionNumber;
    
    private String question;
    
    private List<Choices> choices;
    
    private String hint;

    public Questions(int questionNumber, String question, List<Choices> choices, String hint) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.choices = choices;
        this.hint = hint;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Choices> getChoices() {
        return choices;
    }

    public void setChoices(List<Choices> choices) {
        this.choices = choices;
    }
    
    public String getAnswer() {
        return this.choices.stream().filter(Choices::isAnswer).findAny().get().getChoice();
    }
}