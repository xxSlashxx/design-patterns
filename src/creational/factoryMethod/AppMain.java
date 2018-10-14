package creational.factoryMethod;

public class AppMain
{
    public static void main(String[] args)
    {
        IFactory factory = new ConcreteIFactoryA();
        IProduct product = factory.createProduct();
        System.out.println(product.getName());
    }
}