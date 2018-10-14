package creational.builder;

public class Director
{
    private IBuilder IBuilder;

    public Director(IBuilder IBuilder)
    {
        this.IBuilder = IBuilder;
    }

    public void buildProduct()
    {
        IBuilder.buildName();
        IBuilder.buildPrice();
    }

    public Product getProduct()
    {
        return IBuilder.build();
    }
}