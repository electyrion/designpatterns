package strategy;

public class DummyDuck extends Duck {

    public DummyDuck(String name) {
        super(name);
        flyBehavior = new FlyNoWay();
        eatBehavior = new NoEating();
        quackBehavior = new Squeak();
        getShotBehavior = new InanimateObjectGetShot();
    }

    @Override
    public void display() {
        System.out.println(this.name+" is a Dummy Duck");
    }

}
