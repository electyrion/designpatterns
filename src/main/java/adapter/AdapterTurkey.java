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

/*
 * 1. Create a class that implements the interface you want to adapt.
 * 2. Create a constructor that takes an instance of the class you want to adapt.
 * 3. Implement the interface you want to adapt.
 * 4. In the methods of the interface, call the methods of the class you want to adapt.
 * 5. Create a class that extends the class you want to adapt.
 * 6. Override the methods of the class you want to adapt.
 * 7. In the overridden methods, call the methods of the class you want to adapt.
 * 
 * 
 */