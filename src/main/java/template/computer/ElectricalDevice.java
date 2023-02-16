package template.computer;

public abstract class ElectricalDevice {

    public final void setUpDevice(){
        placeInSomePlace();
        plugToCord();
        switchOn();
    }

    public abstract void switchOn();

    public void plugToCord(){
        System.out.println("Plug to the nearest cord");
    }

    public abstract void placeInSomePlace();

}
