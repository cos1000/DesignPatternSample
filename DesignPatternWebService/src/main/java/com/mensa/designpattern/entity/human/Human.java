/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.entity.human;

import com.mensa.designpattern.state.State;
import com.mensa.designpattern.strategy.Flight;

/**
 *
 * @author matt_
 */
public interface Human {
    String getType(); 
    int getHP(); 
    void setState(State state); 
    State getState(); 
    void attack(); 
    void setFlight(Flight strategy); 
}
