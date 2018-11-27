/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.state;

import com.mensa.designpattern.entity.human.Human;

/**
 *
 * @author matt_
 */
public class StateLevel {
    public static void setState(Human human, boolean up) {
        
        if (up) {
            if (human.getState() instanceof FullHP) {
                return; 
            } else if (human.getState() instanceof NormalHP) {
                human.setState(new FullHP()); 
            } else if (human.getState() instanceof LowHP) {
                human.setState(new NormalHP());
            }
        } else {
            if (human.getState() instanceof FullHP) {
                human.setState(new NormalHP());
            } else if (human.getState() instanceof NormalHP) {
                human.setState(new LowHP()); 
            } else if (human.getState() instanceof LowHP) {
                return; 
            }
        }
        
    }
}
