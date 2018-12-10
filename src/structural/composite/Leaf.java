package structural.composite;

public class Leaf implements Component
{
    @Override
    public void doSomething()
    {
        System.out.println("Leaf");
    }
}