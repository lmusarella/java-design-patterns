/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.structural.bridge;

/**
 * Create a random number between 200 and 300
 * @author edr
 */
public class BigRandomGenerator implements RandomGenerator {
    public int getRandomNumber(){
        return (int)(Math.random()*100)+200;
    }
}
