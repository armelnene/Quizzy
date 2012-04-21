package com.google.gtv;

/**
 *
 * @author Armel
 */
public class Answer {
    private boolean isCorrect;
    private String answerText;
    
    public Answer(String answer, boolean isCorrect){
        setAnswerText(answer);
        setIsCorrect(isCorrect);
    }

    /**
     * @return the isCorrect
     */
    public boolean isCorrect() {
        return isCorrect;
    }

    /**
     * @param isCorrect the isCorrect to set
     */
   private void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    /**
     * @return the answer
     */
    public String getAnswerText() {
        return answerText;
    }

    /**
     * @param answerText the answer to set
     */
    private void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
}
