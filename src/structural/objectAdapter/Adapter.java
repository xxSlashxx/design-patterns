package structural.objectAdapter;

public class Adapter implements ITarget
{
    private Adaptee adaptee;

    public Adapter()
    {
        adaptee = new Adaptee();
    }

    @Override
    public void doSomething()
    {
        adaptee.doSomethingSpecific();
    }
}