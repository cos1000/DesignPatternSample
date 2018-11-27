/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.decorator;

import com.mensa.designpattern.entity.human.Human;
import com.mensa.designpattern.strategy.Flight;

/**
 *
 * @author matt_
 */
public abstract class AdvanceAttack implements Human {
    protected Human human; 
    
    public AdvanceAttack(Human human) {
        this.human = human; 
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName(); 
    }

    @Override
    public void attack() {
        human.attack();
    }
    
    @Override
    public void setFlight(Flight strategy) {
        human.setFlight(strategy);
    }
    
}
