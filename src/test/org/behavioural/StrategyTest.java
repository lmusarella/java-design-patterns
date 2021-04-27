package org.behavioural;

import org.behavioural.strategy.FindContext;
import org.behavioural.strategy.FindStrategy;
import org.behavioural.strategy.SaltyFinder;
import org.behavioural.strategy.SweetsFinder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class StrategyTest {
    private static List<String> foods;
    private FindContext target;

    @BeforeClass
    public static void initialize(){
        foods = new ArrayList<>();
        foods.add("CHEESE");
        foods.add("BREAD");
        foods.add("FISH");;
        foods.add("BREAD");
        foods.add("CAKE");
        foods.add("PIE");
        foods.add("ICECREAM");
    }

    @Before
    public void setUp(){
        target =new FindContext(foods);
    }

    @Test
    public void itShouldBePossibleToFindSweets(){
        //Given
        FindStrategy sweetsStrategy = new SweetsFinder();

        //When
        List<String> sweets = target.findFoods(sweetsStrategy);

        //Then
        assertEquals(3,sweets.size());
    }

    @Test
    public void itShouldBePossibleToFindSalty(){
        //Given
        FindStrategy saltyStrategy = new SaltyFinder();

        //When
        List<String> salty = target.findFoods(saltyStrategy);

        //Then
        assertEquals(4,salty.size());
    }
}
