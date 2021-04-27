/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.structural.composite;

/**
 *
 * @author edr
 */
public class TreeLeaf extends BaseTreeItem {
    @Override
    public void addChild(BaseTreeItem child){
        throw new UnsupportedOperationException("TreeLeaf::addChild");
    }
    
    @Override
    public void operation(){
        System.out.println("TreeLeaf::operation");
    }
}
