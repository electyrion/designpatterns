package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index){
        return (MenuComponent) menuComponents.get(index);
    }

    @Override
    public void print(){
        String message = "Menu{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
        System.out.println(message);

        Iterator iterator = menuComponents.iterator();

        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
