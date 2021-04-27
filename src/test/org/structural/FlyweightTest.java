package org.structural;

import org.junit.Before;
import org.junit.Test;
import org.structural.flyweight.CoffeeFlavour;
import org.structural.flyweight.CoffeeFlavourFactoryImpl;
import org.structural.flyweight.Coffee;
import org.structural.flyweight.CoffeeFlavourFactory;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertSame;

public class FlyweightTest {

    private CoffeeFlavourFactory target;

    @Before
    public void setUp() {
        CoffeeFlavour.resetInstancesCount();
        target = new CoffeeFlavourFactoryImpl();
    }

    @Test
    public void shouldCreateAFlavour(){
        //Given
        Coffee special = new Coffee(target);

        //When
        special.setFlavour("special");

        //Then
        int newInstances = CoffeeFlavour.getInstancesCount();
        assertEquals(1,newInstances);
    }

    @Test
    public void creatingMultipleCoffeesWithSameFlavourWillNotCreateFlavours(){
        //Given
        int instances = CoffeeFlavour.getInstancesCount();
        Coffee arabica = new Coffee(target);
        Coffee arabica2 = new Coffee(target);

        //When
        arabica.setFlavour("arabica");
        arabica2.setFlavour("arabica");

        //Then
        int newInstances = CoffeeFlavour.getInstancesCount();
        assertEquals(1,newInstances);
        assertSame(arabica.getFlavour(),arabica2.getFlavour());
    }
}
