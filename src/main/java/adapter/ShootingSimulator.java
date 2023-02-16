package adapter;

import strategy.WildDuck;

public class ShootingSimulator {

    public static void main(String[] args){

        OldDuckShooter donald = new OldDuckShooter("Donald", 200);

        WildDuck aDuck = new WildDuck("Becky");

        for(int i = 5; i >=1 ; i--) {
            donald.shoot(aDuck);
        }

        System.out.println(aDuck.getName()+" Healthpoint now is "+aDuck.getHealthPoint());
    }

}
