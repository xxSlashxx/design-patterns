package behavioral.visitor;

public class AppMain
{
    public static void main(String[] args)
    {
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        elementA.accept(visitor1);
    }
}
