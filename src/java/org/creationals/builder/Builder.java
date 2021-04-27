/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.creationals.builder;

import org.creationals.commons.CoffeeProduct;

/**
 *
 * @author edr
 */
public interface Builder {

    public ConcreteBuilder setName(String name);
    public ConcreteBuilder setBarCode(String barCode);

    public CoffeeProduct createCoffe();
    
}
