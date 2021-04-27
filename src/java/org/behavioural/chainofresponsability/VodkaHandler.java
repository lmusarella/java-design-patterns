package org.behavioural.chainofresponsability;

public class VodkaHandler implements BarHandler {
    private final BarHandler childHandler;

    public VodkaHandler(BarHandler childHandler){
        this.childHandler = childHandler;
    }
    @Override
    public void handle(Drink drink) {
        if(drink.getName().contains("vodka")){
            drink.pour("VODKA");
        }
        if(this.childHandler !=null && !drink.getName().equals("vodka")) {
            this.childHandler.handle(drink);
        }
    }
}
