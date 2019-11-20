/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package McDonalds.Combos;

import McDonalds.Combos.Combo;

/**
 *
 * @author macgarcia
 */
public abstract class ComboDecorator implements Combo {
    
    protected Combo combo;
    
    ComboDecorator(Combo combo)
    {
        this.combo = combo;
    }
    
    @Override
    public String getComboInformation() {
        return combo.getComboInformation();
    }

    @Override
    public double getComboPrice() {
        return combo.getComboPrice();
    }
    
    @Override 
    public int getComboTime(){
        return combo.getComboTime();
    }
}
