package org.behavioural.mediator;

public class CPU {
    private int frozen=0;
    private int jumped=0;
    private int executed=0;
    public void freeze() { frozen++; }
    public void jump(long position) {jumped++;  }
    public void execute() {  executed++;}

    public int getFrozen() {
        return frozen;
    }

    public int getJumped() {
        return jumped;
    }

    public int getExecuted() {
        return executed;
    }
}
