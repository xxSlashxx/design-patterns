package behavioral.observer;

public class ConcreteObserverA implements IObserver
{
    @Override
    public void update()
    {
        System.out.println("updateConcreteObserverA");
    }
}