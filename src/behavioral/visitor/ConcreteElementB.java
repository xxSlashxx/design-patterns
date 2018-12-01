package behavioral.visitor;

public class ConcreteElementB implements Element
{
    @Override
    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
