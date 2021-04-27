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
public class ConcreteBuilder implements Builder {

    private String name;
    private String barCode;
    
    @Override
    public ConcreteBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ConcreteBuilder setBarCode(String barCode) {
        this.barCode = barCode;
        return this;
    }

    @Override
    public CoffeeProduct createCoffe() {
        verifyProductData();
        CoffeeProduct result = new CoffeeProduct();
        result.setBarCode(barCode);
        result.setName(name);
        return result;
    }

    /**
     * Isolating the verification algorithm
     */
    private void verifyProductData() {
        if(barCode==null && name==null){
            throw new NullPointerException("Must set barCode or name");
        }
    }

}
