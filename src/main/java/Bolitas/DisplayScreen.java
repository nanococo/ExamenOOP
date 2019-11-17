package Bolitas;

import Bolitas.Patterns.Strategy.Context;

import javax.swing.*;
import java.util.ArrayList;

public class DisplayScreen extends JFrame implements IConstants {

    private ArrayList<Bolita> bolitas;
    private Context context;


    public DisplayScreen(int flyWeightQuantity, int prototypeQuantity, int newedQuantity){

        bolitas = new ArrayList<>();
        context = new Context();
        fillArray(flyWeightQuantity, prototypeQuantity, newedQuantity);

        setResizable(false);
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);

        addComponents();

        setVisible(true);

        action();
    }

    private void fillArray(int flyWeightQuantity, int prototypeQuantity, int newedQuantity){

        context.setStrategy(Context.StrategyType.New);
        bolitas.addAll(context.execute(newedQuantity));

        context.setStrategy(Context.StrategyType.FlyWeight);
        bolitas.addAll(context.execute(flyWeightQuantity));

        context.setStrategy(Context.StrategyType.Prototype);
        bolitas.addAll(context.execute(prototypeQuantity));

    }

    private void addComponents(){
        for (Bolita bolita : bolitas)
        {
            this.add(bolita);
        }
    }

    private void moveBolitas(){
        for (Bolita bolita : bolitas)
        {
            bolita.move();
            bolita.repaint();
        }
    }

    private void action(){
        while(true){
            moveBolitas();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }










}
