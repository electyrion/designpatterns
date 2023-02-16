package facade;

public class ComputerSimulator {
    public static void main(String[] args) {
        String name = "Race";
        CPU internalCPU = new CPU(name);
        Harddisk internalHarddisk = new Harddisk("HDD");
        CoolerFan internalCoolerFan = new CoolerFan("Liquid Cooler");
        LCDMontior internalLCDMonitor = new LCDMontior("Simba");
        WirelessMouse internalWirelessMouse = new WirelessMouse("Hovering Mouse");
        WirelessKeyboard internalWirelessKeyboard = new WirelessKeyboard("Hovering Keyboard");

        Computer myComputer = new Computer("Hello", internalCPU, internalHarddisk, internalCoolerFan, internalLCDMonitor, internalWirelessMouse, internalWirelessKeyboard);
        myComputer.switchOn();
    }
}
