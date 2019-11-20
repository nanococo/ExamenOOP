package McDonalds;

import McDonalds.Combos.Combo;
import McDonalds.GUI.GUI;
import McDonalds.Observer;
import McDonalds.Subject;

import java.util.ArrayList;

public class Order implements Subject {

    ArrayList<Observer> arrayObserver = new ArrayList<>();
    Combo combo;
    GUI screen;

    public Order(GUI screen) {
        this.screen = screen;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public Combo getCombo() {
        return combo;
    }



    @Override
    public void attach(Observer pObserver) {
        this.arrayObserver.add(pObserver);
    }

    @Override
    public void detach(Observer pObserver) {
        this.arrayObserver.remove(pObserver);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : arrayObserver){
            observer.update(this);
        }
    }
}
