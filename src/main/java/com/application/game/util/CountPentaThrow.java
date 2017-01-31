/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.game.util;

/**
 *
 * @author Asus
 */
public class CountPentaThrow {
    Integer paircount=0;
    Integer singlecount=0;
    Integer tripletcount=0;

    public Integer getHexacount() {
        return hexacount;
    }

    public void setHexacount(Integer hexacount) {
        this.hexacount = hexacount;
    }
    Integer quadcount=0;
    Integer pentacount=0;
    Integer hexacount=0;
    public void paircountincrement(){paircount++;}
    public void singlecountincrement(){singlecount++;}
    public void tripletcountincrement(){tripletcount++;}
    public void quadcountincrement(){quadcount++;}
    public void pentacountincrement(){pentacount++;}
    public void hexacountincrement(){hexacount++;}
    public Integer getPaircount() {
        return paircount;
    }

    public void setPaircount(Integer paircount) {
        this.paircount = paircount;
    }

    public Integer getSinglecount() {
        return singlecount;
    }

    public void setSinglecount(Integer singlecount) {
        this.singlecount = singlecount;
    }

    public Integer getTripletcount() {
        return tripletcount;
    }

    public void setTripletcount(Integer tripletcount) {
        this.tripletcount = tripletcount;
    }

    public Integer getQuadcount() {
        return quadcount;
    }

    public void setQuadcount(Integer quadcount) {
        this.quadcount = quadcount;
    }

    public Integer getPentacount() {
        return pentacount;
    }

    public void setPentacount(Integer pentacount) {
        this.pentacount = pentacount;
    }
    
}
