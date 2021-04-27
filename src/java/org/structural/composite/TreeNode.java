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
public class TreeNode extends BaseTreeItem {
    
    @Override
    public void operation(){
        System.out.println("TreeNode::operation");
        int i=0;
        BaseTreeItem child = this.getChild(i);
        while(child!=null){
            i++;
            child.operation();
            child = this.getChild(i);
        }
    }
}
