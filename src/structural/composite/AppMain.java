package structural.composite;

public class AppMain
{
    public static void main(String[] args)
    {
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        Leaf leaf4 = new Leaf();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.add(leaf1);
        composite1.add(leaf2);
        composite1.add(leaf3);
        composite2.add(leaf4);
        composite.add(composite1);
        composite.add(composite2);

        //Prints the complete tree
        composite.doSomething();
    }
}