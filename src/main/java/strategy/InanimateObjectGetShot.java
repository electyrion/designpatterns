package strategy;

public class InanimateObjectGetShot extends GetShotBehavior {

    public InanimateObjectGetShot() {
    }

    @Override
    public int reduceHitPoint(int healthPoint) {
        System.out.println("Reducing Healthpoint By 1");
        return healthPoint - 1;
    }

    @Override
    public void dead() {
        System.out.println("After get shot so many time, Now I can be destroyed");
    }
}
