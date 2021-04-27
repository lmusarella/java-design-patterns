/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.creationals;

import org.creationals.builder.ConcreteBuilder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.creationals.commons.CoffeeProduct;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author edr
 */
public class BuilderTest {
    private ConcreteBuilder target;
    
    @Before
    public void setUp(){
        target = new ConcreteBuilder();
        
    }
    
    @Test
    public void itShouldFillOnlyName(){
        //Given
        
        //When
        CoffeeProduct result = target.setName("Robusta").createCoffe();
        
        //Then
        assertEquals(result.getName(),"Robusta");
        assertNull(result.getBarCode());
    }
    
    @Test
    public void itShouldFillOnlyBarCode(){
        //Given
        
        //When
        CoffeeProduct result = target.setBarCode("9781932394856").createCoffe();
        
        //Then
        assertEquals(result.getBarCode(),"9781932394856");
        assertNull(result.getName());
    }
    
    @Test
    public void itShouldFillBoth(){
        //Given
        
        //When
        CoffeeProduct result = target
                .setBarCode("9781932394856")
                .setName("Arabica").createCoffe();
        
        //Then
        assertEquals(result.getBarCode(),"9781932394856");
        assertEquals(result.getName(),"Arabica");
    }

    @Test(expected = NullPointerException.class)
    public void shouldGiveErrorWhenNothingSet(){
        //Given

        //When
        target.createCoffe();

        //Then
        //throws Exception
    }
}
