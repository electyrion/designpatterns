package id.ac.ui.cs.advprog.tutorial4.smartphone.core.factory;

import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.processor.MediaPack;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.processor.Processor;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.ram.RAM;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.ram.SeRAM;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.screen.Delo;
import id.ac.ui.cs.advprog.tutorial4.smartphone.core.components.screen.Screen;

// TODO: Fix this class
public class OddoFactory implements SmartPhoneFactory{

    @Override
    public RAM addRAM() {

        SeRAM seRAM = new SeRAM();
        return seRAM;
    }

    @Override
    public Processor addProcessor() {

        MediaPack mediaPack = new MediaPack();
        return mediaPack;
    }

    @Override
    public Screen addScreen() {

        Delo delo = new Delo();
        return delo;
    }
}