package McDonalds.Combos;

public class Combo3 implements McDonalds.Combos.Combo {
    private String comboInformation;
    private double cost;
    private int time;

    @Override
    public String getComboInformation() {
        return "Combo 3";
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
