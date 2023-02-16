package adapter;

import strategy.Duck;
import strategy.LivingThingsGetShot;

public class AdapterTurkey extends Duck {

    private Turkey privateTurkey;

    public AdapterTurkey(Turkey turkey) {
        super(turkey.getName());
        this.getShotBehavior = new LivingThingsGetShot();
    }

    @Override
    public void display() {

    }
}
