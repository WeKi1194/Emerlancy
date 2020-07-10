package com.emerlancy.master.model;

import org.springframework.context.annotation.Bean;

public class IntroModel {

    private String introMessage;

    public IntroModel(String introMessage) {
        this.introMessage = introMessage;
    }

    public IntroModel() {
    }

    public String getIntroMessage() {
        return introMessage;
    }

    public void setIntroMessage(String introMessage) {
        this.introMessage = introMessage;
    }
}
