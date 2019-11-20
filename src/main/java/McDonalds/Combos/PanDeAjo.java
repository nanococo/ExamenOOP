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
public class PanDeAjo extends ComboDecorator{
    
    public PanDeAjo(Combo combo) {
        super(combo);
    }
    
    @Override
    public String getComboInformation() {
        return this.combo.getComboInformation() + "+ Pan de Ajo";
    }

    @Override
    public double getComboPrice() {
        return this.combo.getComboPrice() + 1.50;
    }

    @Override
    public int getComboTime() {
        return this.combo.getComboTime() + 1;
    }
    
}
