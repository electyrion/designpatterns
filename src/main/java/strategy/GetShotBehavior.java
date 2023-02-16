package strategy;

public abstract class GetShotBehavior {

    protected final int LOWEST_HEALTHPOINT = 0;

    public int getShot(int healthPoint){

        int newHealthPoint;

        if(healthPoint >= LOWEST_HEALTHPOINT){
            newHealthPoint = reduceHitPoint(healthPoint);
        } else {
            dead();
            newHealthPoint = healthPoint;
        }

        return newHealthPoint;
    }

    public abstract int reduceHitPoint(int healthPoint);
    public abstract void dead();
}
