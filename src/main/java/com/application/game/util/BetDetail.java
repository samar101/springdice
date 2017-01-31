package com.application.game.util;


import java.io.Serializable;
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

public class BetDetail  implements Serializable{
    
    public Integer userguess;
    public Integer systhrow;
    public Float betreward;
    public Float betamount;
    
    
    public void logBet(){
        
    }

    public Integer getUserguess() {
        return userguess;
    }

    public void setUserguess(Integer userguess) {
        this.userguess = userguess;
        System.out.println("com.application.game.util.BetDetail.setUserguess()" +userguess);
    }

    public Integer getSysthrow() {
        return systhrow;
    }

    public void setSysthrow(Integer systhrow) {
        this.systhrow = systhrow;
         System.out.println("com.application.game.util.BetDetail.setUserguess()" +systhrow);
    }

    public Float getBetreward() {
        return betreward;
    }

    public void setBetreward(Float betreward) {
        this.betreward = betreward;
         System.out.println("com.application.game.util.BetDetail.setUserguess()" +betreward);
    }

    public Float getBetamount() {
        return betamount;
    }

    public void setBetamount(Float betamount) {
        this.betamount = betamount;
         System.out.println("com.application.game.util.BetDetail.setUserguess()" +betamount);
    }

    
    
    
}
