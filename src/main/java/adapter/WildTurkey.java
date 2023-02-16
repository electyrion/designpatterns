package adapter;

import strategy.FlyWithWings;

public class WildTurkey extends Turkey {

    public WildTurkey() {
    }

    public WildTurkey(String name, int healthPoint) {
        super(name, healthPoint);
        this.flyBehavior = new FlyWithWings();
        this.gobbleBehavior = new GobbleLoudlyBehavior();
    }
}
