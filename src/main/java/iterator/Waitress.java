package iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerHouseMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerHouseMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerHouseMenu = dinerHouseMenu;
    }

    public void printAllMenu(){
        Iterator itPancake = this.pancakeHouseMenu.createIterator();
        Iterator itDiner = this.dinerHouseMenu.createIterator();

        System.out.println("---Pancake Menu---");
        this.prinAllMenuEachHouse(itPancake);
        System.out.println("---Diner Menu---");
        this.prinAllMenuEachHouse(itDiner);
        System.out.println("---End of Menu---");

    }

    private void prinAllMenuEachHouse(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem);
        }
    }
}
