package org.behavioural.templatemethod;

public class MartiniClassicCreator extends MartiniCreator {
    @Override
    protected void mix(Martini result) {
        result.prepare("STIR");
    }

    @Override
    protected void addStrongAlcohol(Martini result) {
        result.prepare("GIN");
    }
}
