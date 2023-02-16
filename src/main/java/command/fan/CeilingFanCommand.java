package command.fan;

//Interface for Command
interface CeilingFanCommand {
    public void execute();
    public void undo();
}

//Class Command
class CeilingFanHighCommand implements CeilingFanCommand {

    int prevSpeed;
    CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.high();
    }

    public void undo(){
        if (this.prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        } else if (this.prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        } else if (this.prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else if (this.prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}

//Class Command
class CeilingFanMediumCommand implements CeilingFanCommand {

    int prevSpeed;
    CeilingFan ceilingFan;

    public CeilingFanMediumCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.medium();
    }
    public void undo(){
        if (this.prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        } else if (this.prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        } else if (this.prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else if (this.prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}

//Class Command
class CeilingFanLowCommand implements CeilingFanCommand {

    int prevSpeed;
    CeilingFan ceilingFan;

    public CeilingFanLowCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.low();
    }

    public void undo(){
        if (this.prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        } else if (this.prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        } else if (this.prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else if (this.prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}

//Class Command
class CeilingFanOffCommand implements CeilingFanCommand {

    int prevSpeed;
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.off();
    }

    public void undo(){
        if (this.prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        } else if (this.prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        } else if (this.prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        } else if (this.prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}

class CeilingFanNoCommand implements CeilingFanCommand {
    int prevSpeed;
    CeilingFan ceilingFan;

    public CeilingFanNoCommand(){
    }

    @Override
    public void execute() {
        System.out.println("No Command Executed");
    }

    public void undo(){
        System.out.println("No Command Executed");
    }
}