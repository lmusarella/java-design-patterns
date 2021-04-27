package org.behavioural.state;

public class TVStartState implements State {
    public boolean isOn(){return true;}
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }

}
