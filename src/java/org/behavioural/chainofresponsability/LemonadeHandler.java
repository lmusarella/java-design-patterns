package org.behavioural.chainofresponsability;

public class LemonadeHandler implements BarHandler {
    private final BarHandler childHandler;

    public LemonadeHandler(BarHandler childHandler){
        this.childHandler = childHandler;
    }
    @Override
    public void handle(Drink drink) {
        if(drink.getName().contains("lemon")){
            drink.pour("LEMON");
        }
        if(this.childHandler !=null && !drink.getName().equals("lemon")) {
            this.childHandler.handle(drink);
        }
    }
}
