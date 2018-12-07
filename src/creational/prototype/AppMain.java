package creational.prototype;

public class AppMain
{
    public static void main(String[] args)
    {
        Prototype prototype = new ConcretePrototype1();
        Prototype prototypeClone = prototype.clone();
        System.out.println(prototype.getType());
        System.out.println(prototypeClone.getType());
    }
}