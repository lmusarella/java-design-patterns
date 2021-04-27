/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.creationals.abstractfactory;

import org.creationals.commons.AbstractProduct;

/**
 *
 * @author edr
 */
public class Client {

    private AbstractFactory factory;
    
    public AbstractProduct retrieveProduct(String name){
        String upper = name.toUpperCase();
        if(name=="BROWNIE"){
            return this.factory.createBrownie();
        }else if(name=="COFFEE"){
            return this.factory.createCoffee();
        }else{
            return null;
        }
    }

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }
}
