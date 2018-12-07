package creational.prototype;

public abstract class Prototype implements Cloneable
{
    protected String type;

    public String getType()
    {
        return type;
    }

    public Prototype clone()
    {
        Prototype clone = null;

        try
        {
            clone = (Prototype) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return clone;
    }
}