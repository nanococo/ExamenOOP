/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package McDonalds.Combos;

/**
 *
 * @author macgarcia
 */
public class BebidaGrande extends ComboDecorator{
    
    public BebidaGrande(Combo combo) {
        super(combo);
    }
    
    @Override
    public String getComboInformation() {
        return this.combo.getComboInformation() + "+ Bebida Grande ";
    }

    @Override
    public double getComboPrice() {
        return this.combo.getComboPrice() + 5.00;
    }
    
    @Override
    public int getComboTime() {
        return this.combo.getComboTime() + 7;
    }
    
}
