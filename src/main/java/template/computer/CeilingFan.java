package template.computer;

public class CeilingFan extends ElectricalDevice {
    @Override
    public void switchOn() {
        System.out.println("Pull the thread to switch the Fan on");
    }

    @Override
    public void placeInSomePlace() {
        System.out.println("Place the Fan at Ceiling");
    }
}
