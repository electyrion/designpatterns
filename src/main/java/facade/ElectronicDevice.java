package facade;


import template.computer.ElectricalDevice;

interface ElectronicDevice {
    public void switchOn();

    public void switchOff();
}

class Computer implements ElectronicDevice {
    private String name;
    private CPU internalCPU;
    private Harddisk internalHarddisk;
    private CoolerFan internalCoolerFan;
    private LCDMontior internalLCDMonitor;
    private WirelessMouse internalWirelessMouse;
    private WirelessKeyboard internalWirelessKeyboard;


    public Computer(String name, CPU internalCPU, Harddisk internalHarddisk, CoolerFan internalCoolerFan, LCDMontior internalLCDMonitor, WirelessMouse internalWirelessMouse, WirelessKeyboard internalWirelessKeyboard) {
        this.name = name;
        this.internalCPU = internalCPU;
        this.internalHarddisk = internalHarddisk;
        this.internalCoolerFan = internalCoolerFan;
        this.internalLCDMonitor = internalLCDMonitor;
        this.internalWirelessMouse = internalWirelessMouse;
        this.internalWirelessKeyboard = internalWirelessKeyboard;
    }

    public String getName() {
        return name;
    }

    @Override
    public void switchOn() {
        System.out.println("Computer Going On");
        internalCPU.switchOn();
        internalHarddisk.switchOn();
        internalCoolerFan.switchOn();
        internalLCDMonitor.switchOn();
        internalWirelessMouse.switchOn();
        internalWirelessKeyboard.switchOn();
    }

    @Override
    public void switchOff() {
        System.out.println("Computer Going Off");
        internalCPU.switchOff();
        internalHarddisk.switchOff();
        internalCoolerFan.switchOff();
        internalLCDMonitor.switchOff();
        internalWirelessMouse.switchOff();
        internalWirelessKeyboard.switchOff();
    }
}

class CPU implements ElectronicDevice {

    private String name;

    public CPU(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void switchOn() {
        System.out.println("CPU Now Going on Boot");
    }

    @Override
    public void switchOff() {
        System.out.println("CPU Now Going Off");
    }
}

class WirelessMouse implements ElectronicDevice {
    private String name;

    public WirelessMouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void switchOn() {
        System.out.println("Wireless Mouse Ready to Be Used");
    }

    @Override
    public void switchOff() {
        System.out.println("Wireless Mouse Now Go Off");
    }
}

class WirelessKeyboard implements ElectronicDevice {
    private String name;

    public WirelessKeyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void switchOn() {
        System.out.println("Wireless Keyboard Ready to Be Used");
    }

    @Override
    public void switchOff() {
        System.out.println("Wireless Keyboard Now Go Off");
    }
}

class LCDMontior implements ElectronicDevice {
    private String name;

    public LCDMontior(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void switchOn() {
        System.out.println("LCD Montior display booting screen");
    }

    @Override
    public void switchOff() {
        System.out.println("LCD Montior display Shut Down Screen");
        System.out.println("LCD Montior Off");
    }
}

class CoolerFan implements ElectronicDevice {
    private String name;

    public CoolerFan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void switchOn() {
        System.out.println("Cooler Fan spinning hard");
    }

    @Override
    public void switchOff() {
        System.out.println("Cooler Fan going off");
    }
}

class Harddisk implements ElectronicDevice {

    private String name;

    public Harddisk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void switchOn() {
        System.out.println("Harddisk Ready to perform I/O assignment");
    }

    @Override
    public void switchOff() {
        System.out.println("Harddisk off");
    }
}


