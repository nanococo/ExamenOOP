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
public class Combo1 implements Combo {
    private String comboInformation;
    private double cost;
    private int time;

    @Override
    public String getComboInformation() {
        return "Combo 1";
    }

    @Override
    public double getComboPrice() {
        return 4.00;
    }
    
    @Override
    public int getComboTime() {
        return 5;
    }
    
    
}
