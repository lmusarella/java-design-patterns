/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.creationals;

import org.creationals.abstractfactory.Client;
import org.creationals.abstractfactory.ConcreteFactory01;
import org.creationals.abstractfactory.ConcreteFactory02;

import org.creationals.commons.AbstractProduct;
import org.creationals.commons.BrownieProduct;
import org.creationals.commons.CoffeeProduct;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.creationals.abstractfactory.AbstractFactory;

/**
 * Changing the factory implementation the client is still able to
 * work correctly. The two factories implement different methods but both returns
 * a CoffeeProduct or a BrownieProduct
 * @author edr
 */
public class AbstractFactoryTest {
    
    @Before
    public void setUp() {
        target = new Client();
    }
    
    private Client target;

    @Test
    public void shouldNotCreateProductWithWrongNamewithConcrete01() {
        //Given
        AbstractFactory factory = new ConcreteFactory01();
        target.setFactory(factory);

        //When
        AbstractProduct result = target.retrieveProduct("PIZZA");

        //Then
        assertNull(result);
    }

    @Test
    public void shouldNotCreateProductWithWrongNamewithConcrete02() {
        //Given
        AbstractFactory factory = new ConcreteFactory02();
        target.setFactory(factory);

        //When
        AbstractProduct result = target.retrieveProduct("PIZZA");

        //Then
        assertNull(result);
    }

    @Test
    public void shouldCreateProductAwithConcrete01() {
        //Given
        AbstractFactory factory = new ConcreteFactory01();
        target.setFactory(factory);
        
        //When
        AbstractProduct result = target.retrieveProduct("COFFEE");
        
        //Then
        assertNotNull(result);
        assertNotNull(result.getId());
        assertTrue(CoffeeProduct.class.isAssignableFrom(result.getClass()));
    }
    
    @Test
    public void shouldCreateProductBwithConcrete01() {
        //Given
        AbstractFactory factory = new ConcreteFactory01();
        target.setFactory(factory);
        
        //When
        AbstractProduct result = target.retrieveProduct("BROWNIE");
        
        //Then
        assertNotNull(result);
        assertNotNull(result.getId());
        assertTrue(BrownieProduct.class.isAssignableFrom(result.getClass()));
    }
            
    @Test
    public void shouldCreateProductAwithConcrete02() {
        //Given
        AbstractFactory factory = new ConcreteFactory02();
        target.setFactory(factory);
        
        //When
        AbstractProduct result = target.retrieveProduct("COFFEE");
        
        //Then
        assertNotNull(result);
        assertEquals(1,((ConcreteFactory02)factory).getCounter());
        assertTrue(CoffeeProduct.class.isAssignableFrom(result.getClass()));
    }
    
    @Test
    public void shouldCreateProductBwithConcrete02() {
        //Given
        AbstractFactory factory = new ConcreteFactory02();
        target.setFactory(factory);
        
        //When
        AbstractProduct result = target.retrieveProduct("BROWNIE");
        
        //Then
        assertNotNull(result);
        assertEquals(1,((ConcreteFactory02)factory).getCounter());
        assertTrue(BrownieProduct.class.isAssignableFrom(result.getClass()));
    }
}
