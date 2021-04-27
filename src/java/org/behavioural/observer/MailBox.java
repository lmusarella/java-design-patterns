	package org.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class MailBox implements Observable{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        for(int i =0;i<observers.size();i++){
            if(observers.get(i)==observer){
                observers.remove(i);
                return;
            }
        }
    }

    @Override
    public void notifyObservers() {
        for(int i =0;i<observers.size();i++) {
            observers.get(i).update();
        }
    }
}
