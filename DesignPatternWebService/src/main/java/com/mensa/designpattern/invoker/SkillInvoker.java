/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.invoker;

import com.mensa.designpattern.receiver.Archery;
import com.mensa.designpattern.receiver.Magic;
import com.mensa.designpattern.receiver.Skill;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matt_
 */
public class SkillInvoker {
    private int ArrowQty = 10; 
    private int Psychic = 100; 
    private List<Skill> skillList = new ArrayList<Skill>(); 
    
    public void add(Skill skill) {
        this.skillList.add(skill); 
    }
    
    public void remove(Skill skill) {
        this.skillList.remove(skill); 
    }
    
    public void invoke() {
        for (Skill skill : skillList) {
            if ((skill instanceof Magic) && (this.Psychic > 0)) {
                skill.post();
                this.Psychic--; 
            } else if ((skill instanceof Archery) && (this.ArrowQty > 0)) {
                skill.post();
                this.ArrowQty--; 
            }
                     
        }
    }
}
