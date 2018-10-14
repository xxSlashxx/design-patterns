package creational.singleton;

public class AppMain
{
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
