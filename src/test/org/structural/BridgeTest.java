/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.structural;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.structural.bridge.RandomStringGenerator;
import org.structural.bridge.SmallRandomGenerator;
import org.structural.bridge.BigRandomGenerator;
import org.structural.bridge.RandomGenerator;

/**
 *
 * @author edr
 */
public class BridgeTest {
    @Test
    public void bridgeShouldBeAbleToUseUseConcreteA(){
        //Given
        RandomGenerator wrapped =new SmallRandomGenerator();
        RandomStringGenerator target = new RandomStringGenerator(wrapped);
        
        //When
        String resultString = target.getRandomString();
        
        //Then
        int result = Integer.parseInt(resultString);
        assertTrue(result>=0);
        assertTrue(result<=100);
    }
    
    @Test
    public void bridgeShouldBeAbleToUseUseConcreteb(){
        //Given
        RandomGenerator wrapped =new BigRandomGenerator();
        RandomStringGenerator target = new RandomStringGenerator(wrapped);
        
        //When
        String resultString = target.getRandomString();
        
        //Then
        int result = Integer.parseInt(resultString);
        assertTrue(result>=200);
        assertTrue(result<=300);
    }
}
