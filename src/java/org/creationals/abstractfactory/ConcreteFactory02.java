/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.creationals.abstractfactory;

import org.creationals.commons.BrownieProduct;
import org.creationals.commons.CoffeeProduct;
import org.creationals.commons.AbstractProduct;

/**
 *
 * @author edr
 */
public class ConcreteFactory02 implements AbstractFactory {

    private int counter = 0;

    public int getCounter(){
        return counter;
    }

    private AbstractProduct countProduct(AbstractProduct data){
        counter++;
        return data;
    }
    @Override
    public AbstractProduct createCoffee() {
        return countProduct(new CoffeeProduct());
    }

    @Override
    public AbstractProduct createBrownie() {
        return countProduct(new BrownieProduct());
    }
    
}
