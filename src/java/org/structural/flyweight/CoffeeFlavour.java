package org.structural.flyweight;

public class CoffeeFlavour {
    private static int instancesCount =0;

    public static int getInstancesCount() {
        return instancesCount;
    }
    public static void resetInstancesCount(){ instancesCount = 0;}

    private final String flavour;

    public CoffeeFlavour(String flavour) {
        this.flavour = flavour;
        instancesCount++;
    }

    public String getFlavour() {
        return flavour;
    }
}
