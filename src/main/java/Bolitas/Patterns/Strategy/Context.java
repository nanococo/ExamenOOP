/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bolitas.Patterns.Strategy;

import Bolitas.Bolita;

import java.util.ArrayList;

public class Context {
    
    public enum StrategyType {New , Prototype, FlyWeight}
    private Strategy strategy;
    
    public void setStrategy(StrategyType strategy)
    {
        switch(strategy)
        {
            case New:
                this.strategy = new CreateNew();
                break;
            case Prototype:
                this.strategy = new CreatePrototype();
                break;
            case FlyWeight:
                this.strategy = new CreateFlyWeight();
                break;
        }
    }
    
    public ArrayList<Bolita> execute(int quantity)
    {
        ArrayList<Bolita> result = new ArrayList<>();
        if(this.strategy != null)
            result = this.strategy.create(quantity);
        return result;
    }

}
