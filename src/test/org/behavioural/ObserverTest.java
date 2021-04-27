package org.behavioural;

import org.behavioural.observer.MailBox;
import org.behavioural.observer.Observable;
import org.behavioural.observer.Observer;
import org.behavioural.observer.Stalker;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ObserverTest {
    private Observable target;

    @Before
    public void setUp(){
        target = new MailBox();
    }

    @Test
    public void stalkerShouldBeNotifiedOfMails(){
        //Given
        Stalker observer = new Stalker();
        target.attach(observer);

        //When
        target.notifyObservers();

        //Then
        assertEquals(1,observer.getStalkedTimes());
    }

    @Test
    public void stalkerDetachedShouldNotBeNotifiedOfMails(){
        //Given
        Stalker observer = new Stalker();
        target.attach(observer);

        //When
        target.detach(observer);
        target.notifyObservers();

        //Then
        assertEquals(0,observer.getStalkedTimes());
    }
}
