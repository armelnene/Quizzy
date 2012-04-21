/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.gtv;

import java.util.List;

/**
 *
 * @author Armel
 */
public class Question {
    private String questionText;
    private List<Answer> answers;
    
    public Question(String questionText, List<Answer> answers){
        setQuestionText(questionText);
        setAnswers(answers);
    };

    private void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    
    public String getQuestionText(){
        return questionText;
    }

    private void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
    
    /**
     * @return the answers
     */
    public List<Answer> getAnswers() {
        return answers;
    }
    
    public Answer getCorrectAnswer(){
        for(Answer answer : getAnswers()){
            if(answer.isCorrect())
                return answer;
        }
        return null;
    }
    
}
