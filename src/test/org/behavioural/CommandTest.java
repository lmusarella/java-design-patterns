package org.behavioural;

import org.behavioural.command.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommandTest {
    private RemoteControl control;

    @Before
    public void setUp(){
        control = new RemoteControl();
    }

    @Test
    public void itShouldBePossibleToSwitchTvOn(){
        //Given
        LcdTv lcdTv = new LcdTv(false);
        assertFalse(lcdTv.isOn());
        Command tvOn = new TvOnCommand(lcdTv);

        //When
        control.setCommand(tvOn);
        control.pressButton();

        assertTrue(lcdTv.isOn());
    }

    @Test
    public void itShouldBePossibleToSwitchTvOff(){
        //Given
        LcdTv lcdTv = new LcdTv(true);
        assertTrue(lcdTv.isOn());
        Command tvOff = new TvOffCommand(lcdTv);

        //When
        control.setCommand(tvOff);
        control.pressButton();

        assertFalse(lcdTv.isOn());
    }
}
