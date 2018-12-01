package behavioral.visitor;

public interface IVisitor
{
    void visit(ConcreteElementA a);

    void visit(ConcreteElementB b);
}
