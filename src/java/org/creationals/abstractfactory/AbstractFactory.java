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
public interface AbstractFactory {
    AbstractProduct createCoffee();
    AbstractProduct createBrownie();
}
