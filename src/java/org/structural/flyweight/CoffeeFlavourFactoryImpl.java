package org.structural.flyweight;

import java.util.concurrent.ConcurrentHashMap;

public class CoffeeFlavourFactoryImpl implements CoffeeFlavourFactory {
    private ConcurrentHashMap<String,CoffeeFlavour> cache = new ConcurrentHashMap<String, CoffeeFlavour>();
    @Override
    public CoffeeFlavour getFlavour(String flavour) {
        return cache.computeIfAbsent(flavour,k->new CoffeeFlavour(k));
    }
}
