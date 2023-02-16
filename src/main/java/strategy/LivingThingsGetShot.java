package strategy;

public class LivingThingsGetShot extends GetShotBehavior {

    public LivingThingsGetShot() {
    }

    @Override
    public int reduceHitPoint(int healthPoint) {
        System.out.println("Reducing Healthpoint By 10");
        return healthPoint - 10;
    }

    @Override
    public void dead() {
        System.out.println("As a living thing, Please don\'t shoot me again");
    }
}
