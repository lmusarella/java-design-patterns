package org.behavioural;

import org.behavioural.chainofresponsability.BarHandler;
import org.behavioural.chainofresponsability.Drink;
import org.behavioural.chainofresponsability.LemonadeHandler;
import org.behavioural.chainofresponsability.VodkaHandler;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChainOfResponsabilityTest {

    private BarHandler target;

    @Test
    public void itShouldBePossibleToPourVodka(){
        //Given
        target = new VodkaHandler(null);
        Drink drink = new Drink("vodka");

        //When
        target.handle(drink);

        //Then
        assertEquals(1,drink.getIngredients().size());
        assertEquals("VODKA",drink.getIngredients().get(0));
    }

    @Test
    public void itShouldBePossibleToPourVodkaLemon(){
        //Given
        target = new VodkaHandler(new LemonadeHandler(null));
        Drink drink = new Drink("vodkalemon");

        //When
        target.handle(drink);

        //Then
        assertEquals(2,drink.getIngredients().size());
        assertEquals("VODKA",drink.getIngredients().get(0));
        assertEquals("LEMON",drink.getIngredients().get(1));
    }


    @Test
    public void itShouldBePossibleToPourLemon(){
        //Given
        target = new VodkaHandler(new LemonadeHandler(null));
        Drink drink = new Drink("lemon");

        //When
        target.handle(drink);

        //Then
        assertEquals(1,drink.getIngredients().size());
        assertEquals("LEMON",drink.getIngredients().get(0));
    }

    @Test
    public void itShouldNotBePossibleToPourMartini(){
        //Given
        target = new VodkaHandler(new LemonadeHandler(null));
        Drink drink = new Drink("martini");

        //When
        target.handle(drink);

        //Then
        assertEquals(0,drink.getIngredients().size());
    }
}
