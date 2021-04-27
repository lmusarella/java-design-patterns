package org.behavioural.state;

public class TVContext implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState=state;
    }

    public State getState() {
        return this.tvState;
    }

    @Override
    public boolean isOn() {
        return this.tvState.isOn();
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }

}
