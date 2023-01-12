package com.spacewell.tennisgame.controller;

import com.spacewell.tennisgame.model.ScoreModel;
import com.spacewell.tennisgame.service.TennisService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TennisController {

    @Autowired
    private TennisService tennisService;

    @Autowired
    private ScoreModel scoreModelRepo;

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String updateScore(@RequestBody ScoreModel scoreModel){
        System.out.println(scoreModel.toString());
        return tennisService.updateScore(scoreModel);
    }

    @RequestMapping(value = "getscore", method = RequestMethod.GET)
    public ScoreModel getScoreModel(){
        System.out.println("Within getScoreModel");
        ScoreModel scoreModel = new ScoreModel();
        BeanUtils.copyProperties(scoreModelRepo, scoreModel);
        return scoreModel;
    }
}
