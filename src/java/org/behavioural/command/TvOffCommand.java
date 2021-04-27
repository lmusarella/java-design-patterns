package org.behavioural.command;

public class TvOffCommand implements Command{

    LcdTv lcdTv;

    public TvOffCommand(LcdTv lcdTv){
        this.lcdTv = lcdTv;
    }

    public void execute(){
        lcdTv.switchOff();
    }

}
