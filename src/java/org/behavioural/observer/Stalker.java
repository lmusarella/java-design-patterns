package org.behavioural.observer;

public class Stalker implements Observer {
    private int stalkedTimes =0;
    @Override
    public void update() {
        stalkedTimes = getStalkedTimes() + 1;
    }

    public int getStalkedTimes() {
        return stalkedTimes;
    }
}
