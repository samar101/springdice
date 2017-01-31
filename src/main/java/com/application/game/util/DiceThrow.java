/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.game.util;

import java.util.concurrent.ThreadLocalRandom;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author Asus
 */
@Configuration
@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DiceThrow {

    static Integer MIN_DICE_VAL = 1;
    static Integer MAX_DICE_VAL = 6;

    public Integer singleThrow() {
        Integer systhrow = 0;

        systhrow = ThreadLocalRandom.current().nextInt(MIN_DICE_VAL, MAX_DICE_VAL + 1);

        System.out.println("sys throw " + systhrow);
        return systhrow;

    }

    public DoubleThrowBean doubleThrow(DoubleThrowBean doublethrow) {

        doublethrow.setFirstsysThrow(singleThrow());
        doublethrow.setSecondsysThrow(singleThrow());
        doublethrow.setTotal(doublethrow.getFirstsysThrow() + doublethrow.getSecondsysThrow());

        return doublethrow;

    }

    public PentaThrowBean pentaThrow(PentaThrowBean pentathrow) {

        pentathrow.setDicerollone(singleThrow());
        pentathrow.setDicerolltwo(singleThrow());
        pentathrow.setDicerollthree(singleThrow());
        pentathrow.setDicerollfour(singleThrow());
        pentathrow.setDicerollfive(singleThrow());
        pentathrow.setTotal(pentathrow.getDicerollone() + pentathrow.getDicerolltwo() + pentathrow.getDicerollthree() + pentathrow.getDicerollfour() + pentathrow.getDicerollfive());

        return pentathrow;

    }
}
