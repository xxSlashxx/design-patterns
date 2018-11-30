package structural.classAdapter;

public class Adaptee implements ITarget
{
    @Override
    public void doSomethingSpecific()
    {
        System.out.println("doSomethingSpecific");
    }
}