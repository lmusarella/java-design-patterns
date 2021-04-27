/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edr
 */
public abstract class BaseTreeItem {
    private List<BaseTreeItem> children;
    
    public BaseTreeItem(){
        this.children = new ArrayList<BaseTreeItem>();
    }
    
    public abstract void operation();
    
    public void addChild(BaseTreeItem child){
        this.children.add(child);
    }
    
    public void removeChild(int index){
        if(this.children.size()>index){
            this.children.remove(index);
        }
    }
    
    public BaseTreeItem getChild(int index){
        if(this.children.size()>index){
            this.children.get(index);
        }
        return null;
    }
}
