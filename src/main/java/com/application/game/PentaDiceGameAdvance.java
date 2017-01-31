/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.game;

import com.application.game.util.DiceThrow;
import com.application.game.util.DoubleThrowBean;
import com.application.game.util.PentaThrowBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author Asus
 */
@Configuration
@Component
@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PentaDiceGameAdvance {
      @Autowired
   DiceThrow dicethrow;
   Float payoutamont;
   Float bankpayroll;

    public Float getPayoutamont() {
        return payoutamont;
    }

    public void setPayoutamont(Float payoutamont) {
        this.payoutamont = payoutamont;
    }

    public Float getBankpayroll() {
        return bankpayroll;
    }

    public void setBankpayroll(Float bankpayroll) {
        this.bankpayroll = bankpayroll;
    }
    
    
    public PentaThrowBean pentathrow(PentaThrowBean bean){
    
    dicethrow.pentaThrow(bean);
    return bean;
    }
    
    
    public void rewardLogic(PentaThrowBean syspentathrow,PentaThrowBean userpentathrow){
    
    
    
    
    }
}
