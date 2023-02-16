package template.computer;

public class DeviceLoader {
    public static void main(String[] args){
        DeskLamp deskLamp = new DeskLamp();
        CeilingFan ceilingFan = new CeilingFan();
        TV tv = new TV();

        deskLamp.setUpDevice();
        System.out.println("------------------");
        ceilingFan.setUpDevice();
        System.out.println("------------------");
        tv.setUpDevice();
    }
}
