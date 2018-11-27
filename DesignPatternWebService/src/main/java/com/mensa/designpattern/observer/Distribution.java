/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.observer;

import com.mensa.designpattern.entity.human.Human;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matt_
 */
public abstract class Distribution {
    protected List<Human> list = new ArrayList<Human>(); 
    
    public void add(Human human) {
        this.list.add(human); 
    }
    
    public void remove(Human human) {
        this.list.remove(human); 
    }

    public abstract void action(); 
    
}
