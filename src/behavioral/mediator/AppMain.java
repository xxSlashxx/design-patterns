package behavioral.mediator;

public class AppMain
{
    public static void main(String[] args)
    {
        IMediator mediator = new Mediator1();
        mediator.changeState();
    }
}
