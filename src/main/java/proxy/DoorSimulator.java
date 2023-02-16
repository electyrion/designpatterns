package proxy;

interface Door {
    public void open();
    public void close();
}

interface SecuredDoor extends Door {
    public void open(String password);
}

public class DoorSimulator {
    public static void main(String[] args){
        Door steelDoor = new SteelDoor("Bank Steel Door");
        DoorWithPassword doorWithPassword = new DoorWithPassword(steelDoor);

        doorWithPassword.open();
        doorWithPassword.open("Hello");
        doorWithPassword.open("secret");

    }
}

class SteelDoor implements Door {

    private String doorName;

    public SteelDoor(String doorName) {
        this.doorName = doorName;
    }

    @Override
    public void open() {
        System.out.println(this.doorName+" is opened");
    }

    @Override
    public void close() {
        System.out.println(this.doorName+" is closed");
    }
}

class DoorWithPassword implements SecuredDoor {
    protected Door steelDoor;

    public DoorWithPassword(Door steelDoor) {
        this.steelDoor = steelDoor;
    }

    @Override
    public void open(String password) {
        if(isAllowed(password)){
            this.steelDoor.open();
        }else{
            System.out.println("Wrong Password");
        }
    }

    private boolean isAllowed(String password){
        return password.equalsIgnoreCase("secret");
    }

    @Override
    public void open() {
        System.out.println("Need Password to be Opened");
    }

    @Override
    public void close() {
        System.out.println(this.steelDoor+" is closed");
    }
}