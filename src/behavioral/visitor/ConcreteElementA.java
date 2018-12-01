package behavioral.visitor;

public class ConcreteElementA implements Element
{
    @Override
    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
