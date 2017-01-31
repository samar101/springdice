/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.game;

import com.application.game.util.DiceThrow;
import com.application.game.util.DoubleThrowBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Asus
 */
@Configuration
public class DoubleDiceGame {
     @Autowired
   DiceThrow dicethrow;
    
    public DoubleThrowBean doubleThrow(DoubleThrowBean doublethrow){
    
   
    
    dicethrow.doubleThrow(doublethrow);
    
        System.out.println("sys throw " + doublethrow );
        return doublethrow;
    
    }
    
    public void rewardLogic(DoubleThrowBean doublethrow){
    
        if(doublethrow.getUserguess().equals(doublethrow.getTotal())){
        
    if(doublethrow.getTotal().equals(Integer.parseInt("7"))){
    doublethrow.setBetreward(doublethrow.getBetAmount()*5);
    }else if(doublethrow.getTotal().equals(Integer.parseInt("6")) || doublethrow.getTotal().equals(Integer.parseInt("8"))){
     doublethrow.setBetreward(doublethrow.getBetAmount()*6);
    }else if(doublethrow.getTotal().equals(Integer.parseInt("5")) || doublethrow.getTotal().equals(Integer.parseInt("9"))){
     doublethrow.setBetreward(doublethrow.getBetAmount()*8);
    }else if(doublethrow.getTotal().equals(Integer.parseInt("4")) || doublethrow.getTotal().equals(Integer.parseInt("10"))){
     doublethrow.setBetreward(doublethrow.getBetAmount()*10);
    }else if(doublethrow.getTotal().equals(Integer.parseInt("3")) || doublethrow.getTotal().equals(Integer.parseInt("11"))){
     doublethrow.setBetreward(doublethrow.getBetAmount()*15); doublethrow.setBetreward(doublethrow.getBetAmount()*5);
    }else if(doublethrow.getTotal().equals(Integer.parseInt("2"))){
     doublethrow.setBetreward(doublethrow.getBetAmount()*0);
    }else if(doublethrow.getTotal().equals(Integer.parseInt("12"))){
     doublethrow.setBetreward(doublethrow.getBetAmount()*20);
    }
    
        }
        else {
        doublethrow.setBetreward(doublethrow.getBetAmount()*0);
        }
    
    }
    
}
