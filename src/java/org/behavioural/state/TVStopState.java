package org.behavioural.state;

public class TVStopState implements State {
    public boolean isOn(){return false;}
    @Override
    public void doAction() {
        System.out.println("TV is turned OFF");
    }

}
