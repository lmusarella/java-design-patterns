package org.behavioural.mediator;

public class Memory {
    private int loaded=0;
    public void load(long position, byte[] data) { loaded = getLoaded() + 1; }

    public int getLoaded() {
        return loaded;
    }
}
