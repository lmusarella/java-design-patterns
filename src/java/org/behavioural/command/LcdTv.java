package org.behavioural.command;

public class LcdTv {
    private boolean on;

    public LcdTv(boolean isOn){
        this.on = isOn;
    }

    public void switchOn(){
        on = true;
    }

    public void switchOff(){
        on = false;
    }

    public boolean isOn(){
        return on;
    }
}
