package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject
{
    private List<IObserver> observers;

    public Subject()
    {
        observers = new ArrayList<>();
    }

    public void registerObserver(IObserver observer)
    {
        if (!observers.contains(observer))
        {
            observers.add(observer);
        }
    }

    public void unregisterObserver(IObserver observer)
    {
        observers.remove(observer);
    }

    public void notifyObservers()
    {
        for (IObserver observer : observers)
        {
            observer.update();
        }
    }
}