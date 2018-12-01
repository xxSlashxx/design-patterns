package behavioral.visitor;

public class ConcreteVisitor2 implements IVisitor
{
    @Override
    public void visit(ConcreteElementA a)
    {
        System.out.println("visit ConcreteElementA in ConcreteVisitor2");
    }

    @Override
    public void visit(ConcreteElementB b)
    {
        System.out.println("visit ConcreteElementA in ConcreteVisitor2");
    }
}
