package adapter;

import strategy.Duck;

public class OldDuckShooter {

    private String name;
    private int bulletCount;

    public OldDuckShooter() {
        this.name = "Default Shooter";
        this.bulletCount = 24;
    }

    public OldDuckShooter(String name, int bulletCount) {
        this.name = name;
        this.bulletCount = bulletCount;
    }

    public void shoot(Duck duck){
        bulletCount -= 1;
        duck.getShot();
    }

}
