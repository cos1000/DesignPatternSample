/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.entity.equipment;

/**
 *
 * @author matt_
 */
public abstract class Equipment {
    protected String name; 
    
    public String displayName() {
        return this.name; 
    }
    
}
