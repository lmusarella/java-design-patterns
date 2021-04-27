/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.creationals.abstractfactory;

import org.creationals.commons.CoffeeProduct;
import org.creationals.commons.BrownieProduct;
import org.creationals.commons.AbstractProduct;

import java.util.UUID;

/**
 *
 * @author edr
 */
public class ConcreteFactory01 implements AbstractFactory {

    private void someOperation(){
        System.out.println("ConcreteFactory01::someOperation");
    }
    @Override
    public AbstractProduct createCoffee() {
        CoffeeProduct result= new CoffeeProduct();
        return setId(result);
    }

    @Override
    public AbstractProduct createBrownie() {
        BrownieProduct result= new BrownieProduct();
        return setId(result);
    }

    public AbstractProduct setId(AbstractProduct product) {
        product.setId(UUID.randomUUID());
        return product;
    }
}
