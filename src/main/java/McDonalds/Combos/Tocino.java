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
public class Tocino extends ComboDecorator{

    public Tocino(Combo combo) {
        super(combo);
    }

    @Override
    public String getComboInformation() {
        return this.combo.getComboInformation() + "+ Tocino";
    }

    @Override
    public double getComboPrice() {
        return this.combo.getComboPrice() + 3.50;
    }

    @Override
    public int getComboTime() {
        return this.combo.getComboTime() + 4;
    }
    
}
