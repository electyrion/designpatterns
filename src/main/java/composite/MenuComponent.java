package composite;

public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Not Supported");
    }
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Not Supported");
    }
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException("Not Supported");
    }
    public String getName(){
        throw new UnsupportedOperationException("Not Supported");
    }
    public String getDescription(){
        throw new UnsupportedOperationException("Not Supported");
    }
    public boolean isVegetarian(){
        throw new UnsupportedOperationException("Not Supported");
    }
    public double getPrice(){
        throw new UnsupportedOperationException("Not Supported");
    }
    public void print(){
        throw new UnsupportedOperationException("Not Supported");
    }
}
