package org.behavioural;

import org.behavioural.memento.Memento;
import org.behavioural.memento.Recipe;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MementoTest {
    @Test
    public void itShouldBePossibleToStoreState(){
        //Given
        List<Memento> freezer = new ArrayList<>();
        Recipe recipe = new Recipe();

        //When
        recipe.set("FlourMixedWithWater");
        recipe.set("YeastAdded");
        freezer.add(recipe.saveToMemento());

        //Then
        assertEquals(freezer.get(freezer.size()-1).getSavedState(),"YeastAdded");
    }

    @Test
    public void itShouldBePossibleToStoreAndRestoreState(){
        //Given
        List<Memento> freezer = new ArrayList<>();
        Recipe recipe = new Recipe();

        recipe.set("FlourMixedWithWater");
        recipe.set("YeastAdded");
        freezer.add(recipe.saveToMemento());
        recipe.set("Fermented");
        freezer.add(recipe.saveToMemento());
        recipe.set("Baked");
        freezer.add(recipe.saveToMemento());
        assertEquals("Baked",freezer.get(freezer.size()-1).getSavedState());

        //When
        recipe.restoreFromMemento(freezer.get(1));

        //Then
        assertEquals("Fermented",recipe.getState());
    }
}
