/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.structural;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.structural.adapter.RandomGenerator;
import org.structural.adapter.NewRandomGeneratorImpl;

/**
 *
 * @author edr
 */
public class AdapterTest {
    @Test
    public void adapterShouldConvertAdapteeResultToString(){
        //Given
        RandomGenerator wrapped =new RandomGenerator();
        NewRandomGeneratorImpl target = new NewRandomGeneratorImpl(wrapped);
        
        //When
        String result = target.getRandomString();
        
        //Then
        assertTrue(Integer.parseInt(result)>=0);
        assertTrue(Integer.parseInt(result)<=100);
    }
}
