/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.structural;

import org.junit.Test;
import org.structural.composite.BaseTreeItem;
import org.structural.composite.TreeLeaf;
import org.structural.composite.TreeNode;

/**
 *
 * @author edr
 */
public class CompositeTest {

    @Test
    public void itShouldBePossibleToAddALeafToComposite(){
        //Given
        BaseTreeItem target = new TreeNode();
        
        //When
        target.addChild(new TreeLeaf());
    }

    @Test
    public void itShouldBePossibleToAddACompositeToComposite(){
        //Given
        BaseTreeItem target = new TreeNode();
        
        //When
        target.addChild(new TreeNode());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void itShouldNotBePossibleToAddALeafToLeaf(){
        //Given
        BaseTreeItem target = new TreeLeaf();
        
        //When
        target.addChild(new TreeLeaf());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void itShouldNotBePossibleToAddAComponentToLeaf(){
        //Given
        BaseTreeItem target = new TreeLeaf();
        
        //When
        target.addChild(new TreeNode());
    }
    
    @Test
    public void itShouldBePossibleToCreateAComplexStructure() {
        BaseTreeItem root = new TreeNode();
        BaseTreeItem childrenContainer = new TreeNode();
        for (int i = 0; i < 10; i++) {
            childrenContainer.addChild(new TreeLeaf());
        }
        root.addChild(new TreeLeaf());
        root.addChild(childrenContainer);
    }
}
