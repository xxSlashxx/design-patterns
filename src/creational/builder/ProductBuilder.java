package creational.builder;

public class ProductBuilder implements IBuilder
{
    private Product product;

    public ProductBuilder()
    {
        product = new Product();
    }

    public void buildName()
    {
        product.setName("TestProduct");
    }

    public void buildPrice()
    {
        product.setPrice(123);
    }

    public Product build()
    {
        return product;
    }
}
