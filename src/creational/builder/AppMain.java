package creational.builder;

public class AppMain
{
    public static void main(String[] args)
    {
        IBuilder productIBuilder = new ProductBuilder();
        Director director = new Director(productIBuilder);
        director.buildProduct();
        System.out.println(director.getProduct());
    }
}