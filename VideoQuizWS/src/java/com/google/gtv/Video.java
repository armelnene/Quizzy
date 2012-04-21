
package com.google.gtv;

import java.util.List;

/**
 *
 * @author Armel
 */
public final class Video {
    
    private String url;
    private Question question;
    
    public Video(String url, Question question){
      setUrl(url);
      setQuestion(question);
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    private void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the question
     */
    public Question getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    private void setQuestion(Question question) {
        this.question = question;
    }


   
}
