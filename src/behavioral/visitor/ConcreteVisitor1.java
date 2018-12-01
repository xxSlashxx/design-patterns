package behavioral.visitor;

public class ConcreteVisitor1 implements IVisitor
{
    @Override
    public void visit(ConcreteElementA a)
    {
        System.out.println("visit ConcreteElementA");
    }

    @Override
    public void visit(ConcreteElementB b)
    {
        System.out.println("visit ConcreteElementB");
    }
}
