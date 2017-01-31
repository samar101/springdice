/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.controller;

import com.application.game.DoubleDiceGame;
import com.application.game.util.BetDetail;
import com.application.game.util.DoubleThrowBean;
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
public class DoubleDiceGameHandler {

    @Autowired
    DoubleDiceGame doubleDice;

    @RequestMapping(value = "/doublethrowcall", produces = "application/json")
    public @ResponseBody
    DoubleThrowBean handler(@RequestParam(value = "betamount") String betamt, @RequestParam(value = "userguess") String userguess) {
        System.out.println("AjAX com.application.controller.SingleDiceGameHandler.handler()" + doubleDice.hashCode() + "betamt " + betamt + "userguess  " + userguess);

        DoubleThrowBean bet = new DoubleThrowBean();
        bet.setUserguess(Integer.parseInt(userguess));
        bet.setBetAmount(Float.parseFloat(betamt));
        doubleDice.doubleThrow(bet);
        doubleDice.rewardLogic(bet);

        return bet;

    }

}
