/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.entity.human;

import com.mensa.designpattern.entity.human.Human;
import com.mensa.designpattern.state.State;
import com.mensa.designpattern.strategy.Flight;

/**
 *
 * @author matt_
 */
public class Archer implements Human {
    Flight flight; 
    int hp = 50; 
    State _state; 
    
    @Override
    public String getType() {
        return this.getClass().getSimpleName(); 
    }

    @Override
    public void attack() {
        flight.execute();
    }

    @Override
    public void setFlight(Flight strategy) {
        flight = strategy; 
    }

    @Override
    public int getHP() {
        return hp; 
    }
    
    @Override
    public void setState(State state) {
        this._state = state; 
    }

    @Override
    public State getState() {
        return this._state; 
    }
            
    
}
