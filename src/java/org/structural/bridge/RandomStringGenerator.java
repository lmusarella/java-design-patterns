/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.structural.bridge;

/**
 *
 * @author edr
 */
public class RandomStringGenerator {
    private final RandomGenerator wrapped;
    
    public RandomStringGenerator(RandomGenerator wrapped){
        this.wrapped =wrapped;
    }

    public String getRandomString() {
        return this.wrapped.getRandomNumber()+"";
    }
}
