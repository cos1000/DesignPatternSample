/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.command;

import com.mensa.designpattern.receiver.Skill;

/**
 *
 * @author matt_
 */
public abstract class CommandSkill {
    protected Skill skill; 
    
    public CommandSkill(Skill skill) {
        this.skill = skill; 
    }
    
    public void postSkill() {
        this.skill.post();
    }
}
