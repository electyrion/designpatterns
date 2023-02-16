package template.computer;

public class DeskLamp extends ElectricalDevice{

    @Override
    public void switchOn() {
        System.out.println("Switching the Lamp on using button");
    }

    @Override
    public void placeInSomePlace() {
        System.out.println("Switch lamp on a Desk");
    }
}
