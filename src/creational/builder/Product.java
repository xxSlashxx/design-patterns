package creational.builder;

public class Product
{
    private String name;
    private int price;

    Product(ProductBuilder builder)
    {
        name = builder.name;
        price = builder.price;
    }

    public String toString()
    {
        return "Name: " + name + " Price: " + price;
    }

    public static class ProductBuilder
    {
        private String name;
        private int price;

        public ProductBuilder setName(String name)
        {
            this.name = name;
            return this;
        }

        public ProductBuilder setPrice(int price)
        {
            this.price = price;
            return this;
        }

        public Product build()
        {
            return new Product(this);
        }
    }
}