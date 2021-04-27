/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.creationals.builder;


import org.creationals.commons.CoffeeProduct;

/**
 * Even called "director"
 * @author edr
 */
public class Client {
    
    public CoffeeProduct build(Builder builder, String name, String barCode){
        return builder
                .setName(name)
                .setBarCode(barCode)
                .createCoffe();
    }
}
