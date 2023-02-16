package template.computer;

public class TV extends ElectricalDevice {
    @Override
    public void switchOn() {
        System.out.println("Switch the TV on using the remote");
    }

    @Override
    public void placeInSomePlace() {
        System.out.println("Place the TV at the wall");
    }
}
