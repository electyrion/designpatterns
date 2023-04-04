package id.ac.ui.cs.advprog.tutorial1.transport.core;

import java.util.ArrayList;
import java.util.List;

public enum Transportation {
    // don't modify the code
    Motorcycle, Car, Airplane;

    /*
     * This method iterates through all the possible values of the Transportation
     * enum and adds their names to an ArrayList of strings called "ret". The method
     * then returns this ArrayList.
     */
    public static List<String> getNames() {
        var ret = new ArrayList<String>();
        for (Transportation transportation : Transportation.values()) {
            ret.add(transportation.name());
        }
        return ret;
    }
}
