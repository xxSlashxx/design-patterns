package behavioral.mediator;

public class Mediator1 implements IMediator
{
    private Colleague1 colleague1;

    private Colleague2 colleague2;

    public Mediator1()
    {
        colleague1 = new Colleague1();
        colleague2 = new Colleague2();
    }

    @Override
    public void changeState()
    {
        colleague1.setState();
        colleague2.setState();
    }
}
