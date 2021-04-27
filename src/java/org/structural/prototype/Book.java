package org.structural.prototype;


//Creazionale!


public class Book extends Item {
    private int pages;

    @Override
    protected Item create() {
        return new Book();
    }

    @Override
    public Item clone(){
        Book result = (Book)super.clone();
        result.setPages(getPages());
        return result;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
