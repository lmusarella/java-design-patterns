package org.behavioural.iterator;

import org.omg.CORBA.Environment;

import java.util.List;

public class EnumerableList implements Enumerable {
    private final List<Object> objects;

    public EnumerableList(List<Object> objects){
        this.objects = objects;
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(this.objects);
    }
}
