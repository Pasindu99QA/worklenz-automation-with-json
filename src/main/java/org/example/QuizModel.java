
package org.example;

public class QuizModel {
    private String name;
    private String question;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String answerFour;
    private String category;

    public String getName() {
        this.name = name;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestion() {
        this.question = question;
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerOne() {
        this.answerOne = answerOne;
        return answerOne;
    }
    public void setAnswerOne(String answerOne) {
        this.answerOne = answerOne;
    }
    public String getAnswerTwo() {
        this.answerTwo = answerTwo;
        return answerTwo;
    }
    public void setAnswerTwo(String answerTwo) {
        this.answerTwo = answerTwo;
    }


    public String getAnswerThree() {
        this.answerThree = answerThree;
        return answerThree;
    }
    public void setAnswerThree(String answerThree) {
        this.answerThree = answerThree;
    }

    public String getAnswerFour() {
        this.answerFour = answerFour;
        return answerFour;
    }
    public void setAnswerFour(String answerFour) {
        this.answerFour = answerFour;
    }

    public String getCategory() {
        this.category = category;
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "[name=" + name + "]";
    }
}