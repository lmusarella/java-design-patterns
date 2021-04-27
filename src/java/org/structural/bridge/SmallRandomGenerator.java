/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.structural.bridge;

/**
 * Create a random number between 0 and 100
 * @author edr
 */
public class SmallRandomGenerator implements RandomGenerator {
    public int getRandomNumber(){
        return (int)(Math.random()*100);
    }
}
