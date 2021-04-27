package org.behavioural.chainofresponsability;

import java.util.ArrayList;
import java.util.List;

public class Drink {
    private String name;
    private List<String> ingredients = new ArrayList<>();

    public Drink(String name){
        this.name = name;
    }

    public List<String> getIngredients(){
        return ingredients;
    }

    public void pour(String drink){
        ingredients.add(drink);
    }

    public String getName() {
        return name;
    }
}
