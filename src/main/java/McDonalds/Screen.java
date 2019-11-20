package McDonalds;

import javax.swing.*;

public class Screen extends JTextArea implements Observer {

    @Override
    public void update(Order order) {
        setText(getText().concat("\n"+order.getCombo().getComboInformation()));
    }

}
