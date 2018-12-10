package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component
{
    private List<Component> childs = new ArrayList<>();

    @Override
    public void doSomething()
    {
        for (Component child : childs)
        {
            child.doSomething();
        }
    }

    public void add(Component child)
    {
        childs.add(child);
    }

    public void remove(Component child)
    {
        childs.remove(child);
    }

    public List<Component> getChilds()
    {
        return childs;
    }
}