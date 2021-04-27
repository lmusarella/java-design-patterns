package org.structural.prototype;

//Creazionale!

public class CD extends Item {
    private int duration;

    @Override
    protected Item create() {
        return new CD();
    }

    @Override
    public Item clone(){
        CD result = (CD)super.clone();
        result.setDuration(getDuration());
        return result;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
