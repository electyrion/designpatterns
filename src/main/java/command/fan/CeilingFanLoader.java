package command.fan;

public class CeilingFanLoader {
    public static void main(String[] args){
        CeilingFan ceilingFan = new CeilingFan("Top Corner");

        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand mediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand lowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(ceilingFan);

        FanRemoteWithUndo remote = new FanRemoteWithUndo();

        remote.setCommandToNumber(0,lowCommand, offCommand);
        remote.setCommandToNumber(1,mediumCommand, offCommand);
        remote.setCommandToNumber(2,highCommand, offCommand);

        remote.pushOnCommandUsingNumber(0);
        remote.pushOffCommandUsingNumber(0);

        remote.pushOnCommandUsingNumber(2);
        remote.undoPushedButton();

    }
}
