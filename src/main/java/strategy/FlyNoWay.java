package strategy;

public class FlyNoWay implements FlyBehavior{
    public FlyNoWay(){}

    public void fly(){
        System.out.println("cannot Fly, sorry Dude!");
    }
}
