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
public class DecoratorExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Combo combo1 = new SalsaTomate(new Hamburguesa(new Combo1()));
        System.out.println(combo1.getComboInformation());
        System.out.println(combo1.getComboPrice() + " $");
        System.out.println(combo1.getComboTime() + " sec");
    }
    
}
