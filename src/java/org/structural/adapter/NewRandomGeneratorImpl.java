/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.structural.adapter;

/**
 *
 * @author edr
 */
public class NewRandomGeneratorImpl implements NewRandomGenerator {
    private final RandomGenerator wrapped;
    
    public NewRandomGeneratorImpl(RandomGenerator wrapped){
        this.wrapped =wrapped;
    }

    @Override
    public String getRandomString() {
        int result = this.wrapped.getRandomNumber();
        return result+"";
    }
}
