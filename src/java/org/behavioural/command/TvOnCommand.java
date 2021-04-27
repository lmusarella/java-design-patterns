package org.behavioural.command;

public class TvOnCommand implements Command{

    LcdTv lcdTv;

    public TvOnCommand(LcdTv lcdTv){
        this.lcdTv = lcdTv;
    }

    public void execute(){
        lcdTv.switchOn();
    }
}
