package behavioral.observer;

public class ConcreteObserverB implements IObserver
{
    @Override
    public void update()
    {
        System.out.println("updateConcreteObserverB");
    }
}