package creational.factoryMethod;

public class ConcreteIFactoryA implements IFactory
{
    @Override
    public IProduct createProduct()
    {
        return new ConcreteProductA();
    }
}
