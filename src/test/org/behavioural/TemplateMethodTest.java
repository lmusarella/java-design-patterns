package org.behavioural;

import org.behavioural.templatemethod.JamesBondMartini;
import org.behavioural.templatemethod.Martini;
import org.behavioural.templatemethod.MartiniClassicCreator;
import org.behavioural.templatemethod.MartiniCreator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TemplateMethodTest {
    @Test
    public void itShouldBePossibleToMakeStandardMartini(){
        //Given
        MartiniCreator target = new MartiniClassicCreator();

        //When
        Martini result = target.makeMartini();

        //Then
        assertTrue(result.getPreparation().contains("STIR"));
        assertTrue(result.getPreparation().contains("GIN"));
    }

    @Test
    public void itShouldBePossibleToMakeJamesBondMartini(){
        //Given
        MartiniCreator target = new JamesBondMartini();

        //When
        Martini result = target.makeMartini();

        //Then
        assertTrue(result.getPreparation().contains("SHAKE"));
        assertTrue(result.getPreparation().contains("VODKA"));
    }
}
