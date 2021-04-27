package org.behavioural;

import org.behavioural.state.State;
import org.behavioural.state.TVContext;
import org.behavioural.state.TVStartState;
import org.behavioural.state.TVStopState;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StateTest {
    @Test
    public void itShouldBePossibleToSwitchOn(){
        //Given
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        //When
        context.setState(tvStartState);
        context.doAction();

        //Then
        assertTrue(context.isOn());
    }

    @Test
    public void itShouldBePossibleToSwitchOffWhenIsOff(){
        //Given
        TVContext context = new TVContext();
        State tvStopState = new TVStopState();
        context.setState(tvStopState);
        context.doAction();

        //When
        context.setState(tvStopState);
        context.doAction();

        //Then
        assertFalse(context.isOn());
    }
}
