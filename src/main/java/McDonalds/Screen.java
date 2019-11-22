package McDonalds;

import McDonalds.Combos.Combo;

import javax.swing.*;
import java.util.ArrayList;

public class Screen extends JTextArea implements Observer {

    ArrayList<Combo> stack;

    @Override
    public void update(Order order) {
        setText(getText().concat("\n"+order.getCombo().getComboInformation()));
    }


}
