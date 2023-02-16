package state;

public class FortuneWheel {
    StartState startState;
    PlayingState playingState;
    StopState stopState;
    FortuneWheelsState currentState;


    public FortuneWheel(){
        startState = new StartState(this);
        playingState = new PlayingState(this);
        stopState = new StopState(this);
        currentState = startState;
    }

    public void rollTheWheel(){
        this.currentState.rollTheWheel();
    }

    public void setState(FortuneWheelsState state){
        this.currentState = state;
    }

    public void instantStop(){
        this.currentState.instantStop();
    }

    public void stopSlowly(){
        this.currentState.stopSlowly();
    }
}
