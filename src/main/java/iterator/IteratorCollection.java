package iterator;

import java.util.ArrayList;
import java.util.Iterator;

interface Menu{
    public Iterator createIterator();
}

class DinerHouseMenuIterator implements Iterator{

    MenuItem[] menuItems;
    int position = 0;

    public DinerHouseMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {

        boolean isHasNext;

        if(position >= menuItems.length || menuItems[position] == null){
            isHasNext = false;
        }else{
            isHasNext = true;
        }

        return isHasNext;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }
}

class PancakeHouseMenuIterator implements Iterator{

    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        boolean isHasNext;

        if(position >= menuItems.size() || menuItems.get(position) == null){
            isHasNext = false;
        }else{
            isHasNext = true;
        }

        return isHasNext;
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position += 1;
        return menuItem;
    }
}
