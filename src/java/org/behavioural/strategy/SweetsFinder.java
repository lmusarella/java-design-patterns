package org.behavioural.strategy;

public class SweetsFinder implements FindStrategy {
    @Override
    public boolean isMatching(String input) {
        return (input=="CAKE" ||
                input == "PIE"||
                input == "SUGAR"||
                input == "ICECREAM");
    }
}
