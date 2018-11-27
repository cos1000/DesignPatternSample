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
public class LowHP implements State {
    
    @Override
    public void attack(Human human) {
        if (human.getHP() <= 30) {
            System.out.println("Small Attack"); 
        } else {
            StateLevel.setState(human, true);
            human.getState().attack(human);
        }
    }

}
