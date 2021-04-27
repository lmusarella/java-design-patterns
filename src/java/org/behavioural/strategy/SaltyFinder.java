package org.behavioural.strategy;

public class SaltyFinder implements FindStrategy {
    @Override
    public boolean isMatching(String input) {
        return (input=="CHEESE" ||
                input == "BREAD"||
                input == "FISH"||
                input == "MEAT");
    }
}
