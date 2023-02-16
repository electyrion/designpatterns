package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();

        this.addItem("Krunchy Pancake", "When eaten, it make crispy sound", false, 12.00);
        this.addItem("Breakfast Pancake", "Pancake with maple syrup", true, 8.00);
        this.addItem("Blueberry Pancake", "Pancake with blueberry syrup and the fruit itself", true, 11.00);
        this.addItem("Nano Nano Pancake", "Salty, Sweet, and Sour in one pancake", false, 16.00);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        return this.menuItems.iterator();
    }
}
