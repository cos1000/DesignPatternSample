/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.strategy;

/**
 *
 * @author matt_
 */
public class NormalAttack implements Flight {

    @Override
    public void execute() {
        System.out.println("Flight"); 
    }
    
}
