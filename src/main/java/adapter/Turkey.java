package adapter;

import strategy.FlyBehavior;
import strategy.GetShotBehavior;

public abstract class Turkey {

    private String name;
    private int healthPoint;
    protected GobbleBehavior gobbleBehavior;
    protected FlyBehavior flyBehavior;
    protected GetShotBehavior getShotBehavior;

    public Turkey() {
        name = "Default Turkey";
        healthPoint = 100;
    }

    public Turkey(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
    }

    public void performGobble(){
        this.gobbleBehavior.gobble();
    }

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void getShot(){
        this.healthPoint= this.getShotBehavior.getShot(this.healthPoint);
    }

    public String getName() {
        return name;
    }
}
