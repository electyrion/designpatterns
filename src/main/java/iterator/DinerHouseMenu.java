package iterator;

import java.util.Iterator;

public class DinerHouseMenu implements Menu{
    static final int MAX_MENU_ITEMS = 6;
    int numberOfItem = 0;
    MenuItem[] menuItems;

    public DinerHouseMenu() {
        this.menuItems = new MenuItem[MAX_MENU_ITEMS];

        this.addItem("Vegetarian Tofu Soup", "Only Tofu and Vegetable Here", true, 20.00);
        this.addItem("Beef Steak", "Meat...Meat..Meaty meat", true, 30.00);
        this.addItem("Fried Chicken with Honey Sauce", "Sweet honey saucec with Fried chicken", false, 25.00);
        this.addItem("Frizza", "Try this new Fried Pizza", false, 30.00);

    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(this.numberOfItem >= this.MAX_MENU_ITEMS){
            System.err.println("Sorry, you cannot add any more menu item in this Diner House");
        }else{
            this.menuItems[numberOfItem] = menuItem;
            this.numberOfItem += 1;
        }
    }

    public Iterator createIterator(){
        return new DinerHouseMenuIterator(this.menuItems);
    }
}
