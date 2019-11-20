package McDonalds.Combos;

public class
Combo4 implements McDonalds.Combos.Combo {
    private String comboInformation;
    private double cost;
    private int time;

    @Override
    public String getComboInformation() {
        return "Combo 4";
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
