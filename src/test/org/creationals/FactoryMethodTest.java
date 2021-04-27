/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.creationals;

import org.creationals.commons.AbstractProduct;
import org.creationals.commons.BrownieProduct;
import org.creationals.commons.CoffeeProduct;
import org.creationals.factorymethod.Client;
import org.creationals.factorymethod.CoffeeCretor;
import org.creationals.factorymethod.BrownieCreator;
import org.creationals.factorymethod.Creator;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * The concrete implementation changes
 * The result changes
 * But the client is still the same
 * @author edr
 */
public class FactoryMethodTest {

    private Client target;
    
    @Before
    public void setUp() {
        target = new Client();
    }
    
    @Test
    public void shouldCreateProductAwithConcrete01() {
        //Given
        Creator creator = new CoffeeCretor();
        target.setCreator(creator);
        
        //When
        AbstractProduct result = target.retrieveProduct();
        
        //Then
        assertNotNull(result);
        assertTrue(CoffeeProduct.class.isAssignableFrom(result.getClass()));
    }
    
    @Test
    public void shouldCreateProductBwithConcrete01() {
        //Given
        Creator creator = new BrownieCreator();
        target.setCreator(creator);
        
        //When
        AbstractProduct result = target.retrieveProduct();
        
        //Then
        assertNotNull(result);
        assertTrue(BrownieProduct.class.isAssignableFrom(result.getClass()));
    }
}
