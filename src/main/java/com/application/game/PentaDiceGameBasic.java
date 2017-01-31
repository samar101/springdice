/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.game;

import com.application.game.util.CountPentaThrow;
import com.application.game.util.DiceThrow;
import com.application.game.util.DoubleThrowBean;
import com.application.game.util.PentaThrowBean;
import com.application.game.util.UserGamesBean;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Asus
 */
@Configuration
public class PentaDiceGameBasic {
      @Autowired
   DiceThrow dicethrow;
    
    
    public PentaThrowBean pentathrow(PentaThrowBean bean){
    
    dicethrow.pentaThrow(bean);
    return bean;
    }
    
    
    public void rewardLogic(PentaThrowBean syspentathrow,PentaThrowBean userpentathrow, UserGamesBean userbean){
    
    
        CountPentaThrow userCount = userpentathrow.getCount();
        CountPentaThrow sysCount = syspentathrow.getCount();
        
        if(userCount.getPentacount()>sysCount.getPentacount())
        {   
        userbean.setReward(userbean.getBetamt()*2);
        userbean.setPaybackamount(userbean.getPaybackamount() + userbean.getReward());
        userbean.setGameswon(userbean.getGameswon()+1);
        userbean.setGamesplayed(userbean.getGameslost()+userbean.getGameswon());
        } else
        if(userCount.getQuadcount()>sysCount.getQuadcount())
        {userbean.setReward(userbean.getBetamt()*2);
        userbean.setPaybackamount(userbean.getPaybackamount() + userbean.getReward());
        userbean.setGameswon(userbean.getGameswon()+1);
        userbean.setGamesplayed(userbean.getGameslost()+userbean.getGameswon());
        } else
        if(userCount.getPaircount()+userCount.getTripletcount() > sysCount.getPaircount()+sysCount.getTripletcount())
        {userbean.setReward(userbean.getBetamt()*2);
        userbean.setPaybackamount(userbean.getPaybackamount() + userbean.getReward());
        userbean.setGameswon(userbean.getGameswon()+1);
        userbean.setGamesplayed(userbean.getGameslost()+userbean.getGameswon());
        } else
        if(userCount.getPaircount()> sysCount.getPaircount())
        {userbean.setReward(userbean.getBetamt()*2);
        userbean.setPaybackamount(userbean.getPaybackamount() + userbean.getReward());
        userbean.setGameswon(userbean.getGameswon()+1);
        userbean.setGamesplayed(userbean.getGameslost()+userbean.getGameswon());
        } else
        if(userpentathrow.getDicerollfive()>userpentathrow.getDicerollfour() && 
                userpentathrow.getDicerollfour()> userpentathrow.getDicerollthree() &&
                userpentathrow.getDicerollthree() > userpentathrow.getDicerolltwo() &&
                userpentathrow.getDicerolltwo() > userpentathrow.getDicerollone())
        {userbean.setReward(userbean.getBetamt()*2);
        userbean.setPaybackamount(userbean.getPaybackamount() + userbean.getReward());
        userbean.setGameswon(userbean.getGameswon()+1);
        userbean.setGamesplayed(userbean.getGameslost()+userbean.getGameswon());
        
        }else{
        userbean.setReward(userbean.getBetamt()*0);
        userbean.setPaybackamount(userbean.getPaybackamount() - userbean.getReward());
        userbean.setGameswon(userbean.getGameslost()+1);
        userbean.setGamesplayed(userbean.getGameslost()+userbean.getGameswon());
        }
    
    }
}
