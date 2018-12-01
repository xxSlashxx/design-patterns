package behavioral.observer;

public class AppMain
{
    public static void main(String[] args)
    {
        ConcreteObserverA observerA = new ConcreteObserverA();
        ConcreteObserverB observerB = new ConcreteObserverB();
        Subject subject = new Subject();

        subject.registerObserver(observerA);
        subject.registerObserver(observerB);
        subject.notifyObservers();
    }
}