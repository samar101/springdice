/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.game.util;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author Asus
 */
@Component
@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PentaThrowBean {
    
    Integer dicerollone;
    Integer dicerolltwo;
    Integer dicerollthree;
    Integer dicerollfour;
    Integer dicerollfive;
    Integer total;
    Float betamt;

    public Integer getDicerollone() {
        return dicerollone;
    }

    public void setDicerollone(Integer dicerollone) {
        this.dicerollone = dicerollone;
        
    }

    public Integer getDicerolltwo() {
        return dicerolltwo;
    }

    public void setDicerolltwo(Integer dicerolltwo) {
        this.dicerolltwo = dicerolltwo;
    }

    public Integer getDicerollthree() {
        return dicerollthree;
    }

    public void setDicerollthree(Integer dicerollthree) {
        this.dicerollthree = dicerollthree;
    }

    public Integer getDicerollfour() {
        return dicerollfour;
    }

    public void setDicerollfour(Integer dicerollfour) {
        this.dicerollfour = dicerollfour;
    }

    public Integer getDicerollfive() {
        return dicerollfive;
    }

    public void setDicerollfive(Integer dicerollfive) {
        this.dicerollfive = dicerollfive;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Float getBetamt() {
        return betamt;
    }

    public void setBetamt(Float betamt) {
        this.betamt = betamt;
    }

    public Float getBetreward() {
        return betreward;
    }

    public void setBetreward(Float betreward) {
        this.betreward = betreward;
    }
    Float betreward;
    
    public HashMap<Integer , Integer> getHashmap(){
    
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        Integer temp ;
        ArrayList<Integer> list = getArrayList();
        for(Integer i : list){
        if(hmap.containsKey(i)){
            temp = hmap.get(i)+1;
        hmap.put(i,temp );
        }
        else{
        hmap.put(i,1 );
        }
        temp=0;
        }
        return hmap;
    
    }
    
    public ArrayList<Integer> getArrayList(){
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(getDicerollone());
        list.add(getDicerolltwo());
        list.add(getDicerollthree());
        list.add(getDicerollfour());
        list.add(getDicerollfive());
        return list;
    }
    
    public CountPentaThrow getCount(){
        
        HashMap<Integer, Integer> usehashmap = getHashmap();
        CountPentaThrow count = new CountPentaThrow();
     for(Integer key : usehashmap.keySet()){
        if(usehashmap.get(key)==2){
        count.paircountincrement();
        }else
        if(usehashmap.get(key)==3){
         count.tripletcountincrement();
        }else
        if(usehashmap.get(key)==4){
         count.quadcountincrement();
        }else
        if(usehashmap.get(key)==5){
         count.paircountincrement();
        }else
        if(usehashmap.get(key)==6){
         count.hexacountincrement();
        }else
        if(usehashmap.get(key)==1){
         count.singlecountincrement();
        }
    
    }
    
    return count;
    }
}
