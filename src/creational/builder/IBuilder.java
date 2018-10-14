package creational.builder;

public interface IBuilder
{
    void buildName();

    void buildPrice();

    Product build();
}
