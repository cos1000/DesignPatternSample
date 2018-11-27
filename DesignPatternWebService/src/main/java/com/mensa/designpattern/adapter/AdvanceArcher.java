/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.adapter;

import com.mensa.designpattern.decorator.AdvanceAttack;
import com.mensa.designpattern.entity.human.Archer;
import com.mensa.designpattern.entity.human.Human;
import com.mensa.designpattern.state.State;

/**
 *
 * @author matt_
 */
public class AdvanceArcher extends AdvanceAttack {
    private Archer archer; 

    public AdvanceArcher(Human human) {
        super(human);
    }

    @Override
    public int getHP() {
        return this.human.getHP(); 
    }

    @Override
    public void setState(State state) {
        this.human.setState(state);
    }

    @Override
    public State getState() {
        return this.human.getState(); 
    }
}
