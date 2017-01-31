package com.application.game;

import com.application.game.util.BetDetail;
import com.application.game.util.DiceThrow;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
@Configuration
public class SingleDiceGame {
    @Autowired
   DiceThrow dicethrow;
     
    
    public Integer singleThrow(){
    Integer systhrow=0;
    
    systhrow = dicethrow.singleThrow();
    
        System.out.println("sys throw " + systhrow );
        return systhrow;
        
    }
    
    public void rewardLogic(BetDetail bet){
    
    if(bet.getUserguess().equals(bet.getSysthrow())){
    bet.setBetreward(bet.getBetamount()*5);
    }else
        bet.setBetreward(new Float (0.0));
    
    
    
    }
    
}
