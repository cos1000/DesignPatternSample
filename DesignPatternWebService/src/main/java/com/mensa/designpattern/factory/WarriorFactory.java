/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.factory;

import com.mensa.designpattern.entity.human.Warrior;
import com.mensa.designpattern.entity.human.Human;

/**
 *
 * @author matt_
 */
public class WarriorFactory implements HumanFactory {

    @Override
    public Human createHuman() {
        return new Warrior(); 
    }
    
}
