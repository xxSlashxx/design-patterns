package creational.builder;

public class AppMain
{
    public static void main(String[] args)
    {
        Product product = new Product.ProductBuilder().setName("TestProduct").setPrice(123).build();
        System.out.println(product);
    }
}