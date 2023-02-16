package state;

interface FortuneWheelsState {
    public void rollTheWheel();
    public void instantStop();
    public void stopSlowly();
}

class StartState implements FortuneWheelsState{

    FortuneWheel fortuneWheel;

    public StartState(FortuneWheel fortuneWheel){
        this.fortuneWheel = fortuneWheel;
    }

    @Override
    public void rollTheWheel() {
        System.out.println("Roll the Wheel");
        fortuneWheel.setState(this.fortuneWheel.playingState);
    }

    @Override
    public void instantStop() {
        System.out.println("You have not done anything yet, do nothing here!");
    }

    @Override
    public void stopSlowly() {
        System.out.println("You have not done anything yet, do nothing here!");
    }
}

class PlayingState implements FortuneWheelsState {

    FortuneWheel fortuneWheel;

    public PlayingState(FortuneWheel fortuneWheel){
        this.fortuneWheel = fortuneWheel;
    }

    @Override
    public void rollTheWheel() {
        System.out.println("Wheels already spinning, do nothing here!");
    }

    @Override
    public void instantStop() {
        System.out.println("Stop Immediately");
        this.fortuneWheel.setState(this.fortuneWheel.stopState);
    }

    @Override
    public void stopSlowly() {
        System.out.println("5..4..3..2..1..Stop");
        this.fortuneWheel.setState(this.fortuneWheel.stopState);
    }
}

class StopState implements FortuneWheelsState {

    FortuneWheel fortuneWheel;

    public StopState(FortuneWheel fortuneWheel){
        this.fortuneWheel = fortuneWheel;
    }

    @Override
    public void rollTheWheel() {
        System.out.println("Roll the Wheel Again");
        this.fortuneWheel.setState(this.fortuneWheel.playingState);
    }

    @Override
    public void instantStop() {
        System.out.println("Your result already displayed, do nothing here!");
    }

    @Override
    public void stopSlowly() {
        System.out.println("Your result already displayed, do nothing here!");
    }
}
