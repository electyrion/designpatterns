package state;

public class Player {
    public static void main(String[] args){
        FortuneWheel fortuneWheel = new FortuneWheel();

        fortuneWheel.rollTheWheel();

        fortuneWheel.instantStop();

        fortuneWheel.rollTheWheel();

        fortuneWheel.stopSlowly();

        fortuneWheel.instantStop();
    }
}
