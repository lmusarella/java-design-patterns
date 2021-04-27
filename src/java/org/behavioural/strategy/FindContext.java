package org.behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

public class FindContext {
    private List<String> items;

    public FindContext(List<String> items) {
        this.items = items;
    }

    public List<String> findFoods(FindStrategy strategy){
        List<String> result = new ArrayList<>();
        for(int i = 0; i< items.size(); i++){
            if(strategy.isMatching(items.get(i))){
                result.add(items.get(i));
            }
        }
        return result;
    }
}
