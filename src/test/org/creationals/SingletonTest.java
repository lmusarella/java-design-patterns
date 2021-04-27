/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.creationals;

import org.creationals.singleton.SingletonService;

import static org.junit.Assert.assertSame;
import org.junit.Test;

/**
 *
 * @author edr
 */
public class SingletonTest {
    @Test
    public void multipleCallsShouldNotCreateNewObject(){
       //Given 
       
       //When
       SingletonService result1 = SingletonService.getInstance();
       SingletonService result2 = SingletonService.getInstance();
        
       //Then
       assertSame(result2, result1);
    }
}
