package strategy;

public class WildDuck extends Duck {

    public WildDuck(String name) {
        super(name);
        flyBehavior = new FlyWithWings();
        eatBehavior = new EatFood();
        quackBehavior = new Quack();
        getShotBehavior = new LivingThingsGetShot();
    }

    @Override
    public void display() {
        System.out.println(this.name+" is a Wild Duck");
    }
}
