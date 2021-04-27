package org.structural.flyweight;

public class Coffee {
    private CoffeeFlavourFactory flavourFactory;
    private CoffeeFlavour flavour;
    private String name;

    public Coffee(CoffeeFlavourFactory flavourFactory) {
        this.flavourFactory = flavourFactory;
    }

    public void setFlavour(String flavour){
        this.flavour = this.flavourFactory.getFlavour(flavour);
    }

    public CoffeeFlavour getFlavour() {
        return flavour;
    }

    public void setFlavour(CoffeeFlavour flavour) {
        this.flavour = this.flavourFactory.getFlavour(flavour.getFlavour());;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
