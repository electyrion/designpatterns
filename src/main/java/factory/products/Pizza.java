package factory.products;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza extends Product {

    private List<Cheese> cheeseToppings;
    private List<ChilliSauce> chilliSauceToppings;
    private List<Meatball> meatballToppings;
    private List<Paprika> paprikaToppings;
    private List<Sausage> sausageToppings;
    private List<Tomato> tomatoToppings;
    private List<TomatoSauce> tomatoSauceToppings;

    public Pizza() {
        cheeseToppings = new ArrayList<Cheese>();
        chilliSauceToppings = new ArrayList<ChilliSauce>();
        meatballToppings = new ArrayList<Meatball>();
        paprikaToppings = new ArrayList<Paprika>();
        sausageToppings = new ArrayList<Sausage>();
        tomatoToppings = new ArrayList<Tomato>();
        tomatoSauceToppings = new ArrayList<TomatoSauce>();
        toppings = new ArrayList<ToppingIngredients>();
    }

    public void addTopping(Cheese cheese){
        cheeseToppings.add(cheese);
    }

    public void addTopping(ChilliSauce chilliSauce){
        chilliSauceToppings.add(chilliSauce);
    }

    public void addTopping(Meatball meatball){
        meatballToppings.add(meatball);
    }

    public void addTopping(Paprika paprika){
        paprikaToppings.add(paprika);
    }

    public void addTopping(Sausage sausage){
        sausageToppings.add(sausage);
    }

    public void addTopping(Tomato tomato){
        tomatoToppings.add(tomato);
    }

    public void addTopping(TomatoSauce tomatoSauce){
        tomatoSauceToppings.add(tomatoSauce);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheeseToppings=" + cheeseToppings +
                ", chilliSauceToppings=" + chilliSauceToppings +
                ", meatballToppings=" + meatballToppings +
                ", paprikaToppings=" + paprikaToppings +
                ", sausageToppings=" + sausageToppings +
                ", tomatoToppings=" + tomatoToppings +
                ", tomatoSauceToppings=" + tomatoSauceToppings +
                '}';
    }

    private List<ToppingIngredients> toppings;

    public void addTopping(ToppingIngredients ingredient){
        toppings.add(ingredient);
    }

    public void resetTopping(){
        toppings.clear();
    }

    public List<ToppingIngredients> getAllToppings(){
        return toppings;
    }


}
