package behavioral.mediator;

public class Colleague2 implements IColleague
{
    private IMediator mediator;

    @Override
    public void setState()
    {
        System.out.println("setStateAtColleague2");
    }
}
