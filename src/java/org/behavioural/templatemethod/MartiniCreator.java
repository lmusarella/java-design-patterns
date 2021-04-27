package org.behavioural.templatemethod;

public abstract class MartiniCreator {
    public Martini makeMartini(){
        Martini result = new Martini();
        addStrongAlcohol(result);
        addMartini(result);
        mix(result);
        return result;
    }

    protected abstract void mix(Martini result);

    private void addMartini(Martini result) {
        result.prepare("MARTINI");
    }

    protected abstract void addStrongAlcohol(Martini result);
}
