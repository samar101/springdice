/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.controller;

import com.application.game.util.BetDetail;
import com.application.game.SingleDiceGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Asus
 */
@Controller
public class SingleDiceGameHandler {
    
    
    @Autowired
    SingleDiceGame singleDice;
    @RequestMapping(value = "/ajaxcall", produces = "application/json")
    public @ResponseBody BetDetail handler(@RequestParam(value="betamount") String betamt, @RequestParam(value="userguess") String userguess){
        System.out.println("AjAX com.application.controller.SingleDiceGameHandler.handler()"+singleDice.hashCode()+"betamt "+betamt+"userguess  "+userguess);
    
    BetDetail bet=new BetDetail();
    bet.setSysthrow(singleDice.singleThrow());
   bet.setUserguess(Integer.parseInt(userguess));
    bet.setBetamount(Float.parseFloat(betamt));
    singleDice.rewardLogic(bet);
    
    bet.logBet();
    return bet;
    
    }
    
    
    
    
}
