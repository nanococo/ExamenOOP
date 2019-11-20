package McDonalds;

import McDonalds.Observer;

public interface Subject {
    void attach(Observer pObserver);
    void detach(Observer pObserver);
    void notifyObservers();
}
