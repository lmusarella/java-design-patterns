package org.behavioural.templatemethod;

public class Martini {
    private String preparation;

    public String getPreparation() {
        return preparation;
    }

    public void prepare(String recipe){
        if(preparation!=null){
            preparation+=",";
        }
        preparation+=recipe;
    }
}
