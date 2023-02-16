package adapter;

import strategy.FlyNoWay;

public class DummyTurkey extends Turkey {

    public DummyTurkey() {
    }

    public DummyTurkey(String name, int healthPoint) {
        super(name, healthPoint);
        this.flyBehavior = new FlyNoWay();
        this.gobbleBehavior = new MuteGobbleBehavior();
    }
}
