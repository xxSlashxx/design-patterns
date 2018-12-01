package behavioral.visitor;

public interface Element
{
    void accept(IVisitor visitor);
}
