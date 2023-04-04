package id.ac.ui.cs.advprog.tutorial4.smartphone.core.brand;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.factory.SmartPhoneFactory;

public class Oddo extends SmartPhone{
    SmartPhoneFactory smartPhoneFactory;

    public Oddo(SmartPhoneFactory smartPhoneFactory){
        this.smartPhoneFactory = smartPhoneFactory;
        setName("Oddo");
    }

    // TODO: Complete this method
    public void create(){

        System.out.println("Creating smartphone " + getName());


        setProcessor(smartPhoneFactory.addProcessor());
        setRAM(smartPhoneFactory.addRAM());
        setScreen(smartPhoneFactory.addScreen());
    }

    // TODO: Complete this method
    public void calculatePrice() {

        System.out.println("Calculating price for " + getName());

        setPrice(2 * getProcessor().getPrice() + 2 * getRAM().getPrice() + 2 * getScreen().getPrice());
    }
}