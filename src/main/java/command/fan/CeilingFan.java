package command.fan;

// Class Receiver
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String location;
    private int speed;

    public CeilingFan(String location){
        this.location = location;
        this.speed = OFF;
    }

    public void high(){
        this.speed = HIGH;
        System.out.println("Ceiling Fan going High");
    }

    public void medium(){
        this.speed = MEDIUM;
        System.out.println("Ceiling Fan going Medium");
    }

    public void low(){
        this.speed = LOW;
        System.out.println("Ceiling Fan going Low");
    }

    public void off(){
        this.speed = OFF;
        System.out.println("Ceiling Fan going Off");
    }

    public int getSpeed(){
        return this.speed;
    }

}
