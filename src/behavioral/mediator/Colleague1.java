package behavioral.mediator;

public class Colleague1 implements IColleague
{
    private IMediator mediator;

    @Override
    public void setState()
    {
        System.out.println("setStateAtColleague1");
    }
}
