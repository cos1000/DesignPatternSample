/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.decorator;

import com.mensa.designpattern.entity.human.Human;
import com.mensa.designpattern.state.State;
import com.mensa.designpattern.strategy.Flight;

/**
 *
 * @author matt_
 */
public class StrongAttack extends AdvanceAttack {
    
    public StrongAttack(Human human) {
        super(human);
    }

    @Override
    public void setFlight(Flight strategy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHP() {
        return this.human.getHP(); 
    }

    @Override
    public void setState(State state) {
        human.setState(state);
    }

    @Override
    public State getState() {
        return human.getState(); 
    }
    
}
