package com.emerlancy.master.resources;


import com.emerlancy.master.model.IntroModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emerlancy")
public class Intro {

    IntroModel introModel = new IntroModel();

    @RequestMapping("/intro")
    public IntroModel showIntro(String message){
        introModel.setIntroMessage("Welcome to Emerlancy App");
        message = introModel.getIntroMessage();
        return new IntroModel(introModel.getIntroMessage());
    }
}
