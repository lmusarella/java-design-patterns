package org.behavioural.templatemethod;

public class JamesBondMartini extends MartiniCreator {
    @Override
    protected void mix(Martini result) {
        result.prepare("SHAKE");
    }

    @Override
    protected void addStrongAlcohol(Martini result) {
        result.prepare("VODKA");
    }
}
