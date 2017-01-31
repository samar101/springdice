/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.controller;

import com.application.game.PentaDiceGameBasic;
import com.application.game.util.PentaThrowBean;
import com.application.game.util.UserGamesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Asus
 */
@Controller
@Scope(value = "session")
public class PentaDiceGameBasicHandler {
    
    PentaThrowBean systemfivedicethrow;
    PentaThrowBean userfivedicethrow;
    @Autowired
    UserGamesBean gamebean;
    @Autowired
    PentaDiceGameBasic pentagame;
    
    @RequestMapping(value = "/syspentathrowcall", produces = "application/json")
    public @ResponseBody PentaThrowBean getsystemfivedice(){
    systemfivedicethrow = new PentaThrowBean();
    pentagame.pentathrow(systemfivedicethrow);
    System.out.println("sys throw ****"+systemfivedicethrow.hashCode());
    return systemfivedicethrow;
    
    }
    @RequestMapping(value = "/userpentathrowcall", produces = "application/json")
    public @ResponseBody PentaThrowBean usersystemfivedice(){
    userfivedicethrow = new PentaThrowBean();
    pentagame.pentathrow(userfivedicethrow);
    System.out.println("user sys  throw ****"+systemfivedicethrow.hashCode());
    System.out.println("user  user throw ****"+userfivedicethrow.hashCode());
    return userfivedicethrow;
    }
    
    @RequestMapping(value = "/dicepokerbasicreward", produces = "application/json")
    public  @ResponseBody UserGamesBean getreward(@RequestParam(value = "dicepokerbetamt") String betamt){
    gamebean.setBetamt(Float.parseFloat(betamt));
    
    System.out.println("reward use throw ****"+userfivedicethrow.hashCode());
    System.out.println("reward use throw ****"+gamebean.hashCode());
    System.out.println("reward use throw ****"+gamebean.getPaybackamount());
    System.out.println("reward sys throw ****"+systemfivedicethrow.hashCode());
    pentagame.rewardLogic(systemfivedicethrow, userfivedicethrow,gamebean);    
    return gamebean;
    }
    
}
