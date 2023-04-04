package id.ac.ui.cs.advprog.tutorial4.smartphone.core.factory;

import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.processor.ExyYes;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.processor.Processor;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.processor.SnackDragon;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.ram.GeRAM;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.ram.RAM;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.screen.Delo;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.screen.Screen;

// TODO: Fix this class
public class SiomiFactory implements SmartPhoneFactory{
    @Override
    public RAM addRAM() {

        GeRAM geRAM = new GeRAM();
        return geRAM;
    }

    @Override
    public Processor addProcessor() {

        SnackDragon snackDragon = new SnackDragon();
        return snackDragon;
    }

    @Override
    public Screen addScreen() {

        Delo delo = new Delo();
        return delo;
    }
}