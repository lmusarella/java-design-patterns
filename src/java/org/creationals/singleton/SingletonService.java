/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.creationals.singleton;

/**
 *
 * @author edr
 */
public class SingletonService {
    private static SingletonService instance;
    
    private SingletonService(){
        
    }
    
    public static synchronized SingletonService getInstance(){ //syncronized per evitare di creare pi� istanze se avvio pi� thread
        if(instance==null){
            instance = new SingletonService();
        }
        return instance;
    }
}
