package org.structural.prototype;

//Creazionale!

public abstract class Item {
    private String title;
    private int price;

    protected abstract Item create();

    public Item clone() {
        Item cloned =create();
        cloned.setPrice(this.getPrice());
        cloned.setTitle(this.getTitle());
        return cloned;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
