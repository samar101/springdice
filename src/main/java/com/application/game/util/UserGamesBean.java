/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.game.util;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author Asus
 */
@Component
@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserGamesBean {
    
    Float reward;
    Float betamt;
     Float paybackamount;
    Integer gamesplayed;
    Integer gameslost;
    Integer gameswon;

    public Float getReward() {
        return reward;
    }

    public void setReward(Float reward) {
        this.reward = reward;
    }

    public Float getBetamt() {
        return betamt;
    }

    public void setBetamt(Float betamt) {
        this.betamt = betamt;
    }

    public Integer getGamesplayed() {
        return gamesplayed;
    }

    public void setGamesplayed(Integer gamesplayed) {
        this.gamesplayed = gamesplayed;
    }

    public Integer getGameslost() {
        return gameslost;
    }

    public void setGameslost(Integer gameslost) {
        this.gameslost = gameslost;
    }

    public Integer getGameswon() {
        return gameswon;
    }

    public void setGameswon(Integer gameswon) {
        this.gameswon = gameswon;
    }
   

   

    public Float getPaybackamount() {
        return paybackamount;
    }

    public void setPaybackamount(Float paybackamount) {
        this.paybackamount = paybackamount;
    }
    
}
