/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.receiver;

/**
 *
 * @author matt_
 */
public class Magic implements Skill {

    @Override
    public void post() {
        System.out.println("*** Cold ***"); 
    }
    
}
