package org.behavioural.iterator;

import java.util.List;

public class ListIterator implements Iterator{
	
    private final List<Object> objects;
    private int cursor;

    public ListIterator(List<Object> objects) {
        this.objects = objects;
        this.cursor = -1;
    }

    @Override
    public void first() {
        cursor = -1;
        if(objects.size()>0)cursor =0;
    }

    @Override
    public boolean next() {
        if(objects.size()>(cursor+1)){
            cursor++;
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        if(objects.size()<=cursor || cursor<0)return null;
        return objects.get(cursor);
    }
}
