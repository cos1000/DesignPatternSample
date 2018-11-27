/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mensa.designpattern.singleton;

/**
 *
 * @author matt_
 */
public class GameObjectLibrary {
    private static GameObjectLibrary instance = null; 
    
    private GameObjectLibrary() {
        
    }
    
    public static GameObjectLibrary getInstance() {
        if (instance == null) instance = new GameObjectLibrary(); 
        return instance; 
    }
            
}
