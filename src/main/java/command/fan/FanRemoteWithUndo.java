package command.fan;

public class FanRemoteWithUndo {

    private CeilingFanCommand[] onCommands;
    private CeilingFanCommand[] offCommands;
    private CeilingFanCommand undoCommand;

    public FanRemoteWithUndo(){
        onCommands = new CeilingFanCommand[7];
        offCommands = new CeilingFanCommand[7];
        CeilingFanNoCommand noCommand = new CeilingFanNoCommand();
        undoCommand = noCommand;
    }

    public void setCommandToNumber(int buttonNumber, CeilingFanCommand onCommand, CeilingFanCommand offCommand){
        onCommands[buttonNumber] = onCommand;
        offCommands[buttonNumber] = offCommand;
    }

    public void pushOnCommandUsingNumber(int buttonNumber){
        onCommands[buttonNumber].execute();
        undoCommand = onCommands[buttonNumber];
    }

    public void pushOffCommandUsingNumber(int buttonNumber){
        offCommands[buttonNumber].execute();
        undoCommand = offCommands[buttonNumber];
    }

    public void undoPushedButton(){
        this.undoCommand.undo();
    }

}
