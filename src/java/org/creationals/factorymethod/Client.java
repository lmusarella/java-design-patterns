/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.creationals.factorymethod;

import org.creationals.commons.AbstractProduct;

import java.util.UUID;

/**
 *
 * @author edr
 */
public class Client {

    private Creator creator;
    
    public AbstractProduct retrieveProduct(){
        AbstractProduct result = creator.factoryMethod();
        return addId(result);
    }

    private AbstractProduct addId(AbstractProduct result) {
        result.setId(UUID.randomUUID());
        return result;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }
}
