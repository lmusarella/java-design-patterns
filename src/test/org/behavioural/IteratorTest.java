package org.behavioural;

import org.behavioural.iterator.EnumerableList;
import org.behavioural.iterator.Iterator;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;

public class IteratorTest {
    @Test
    public void emptyIterator(){
        //Given
        EnumerableList enumerable = new EnumerableList(new ArrayList<>());
        Iterator target = enumerable.createIterator();

        //When/Then
        assertEquals(false,target.next());
        assertNull(target.currentItem());
    }


    @Test
    public void iteratorWithData(){
        //Given
        ArrayList<Object> data = new ArrayList<Object>();
        data.add(1);
        data.add(2);

        EnumerableList enumerable = new EnumerableList(data);
        Iterator target = enumerable.createIterator();

        //When/Then
        int index =0;
        while(target.next()){
            assertEquals(data.get(index),target.currentItem());
            index++;
        }
        assertEquals(2,index);
    }
}
