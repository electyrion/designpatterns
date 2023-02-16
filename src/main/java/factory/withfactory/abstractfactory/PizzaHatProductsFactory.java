package factory.withfactory.abstractfactory;

import factory.products.*;

public class PizzaHatProductsFactory implements ProductFactory{
    @Override
    public ToppingIngredients createTopping(String type) {
        ToppingIngredients toppingIngredients = null;
        String pizzaHatStyle = "Pizza Hat Style";

        if (type.equalsIgnoreCase("Cheese")){
            toppingIngredients = new Cheese(pizzaHatStyle);
        } else if (type.equalsIgnoreCase("Chilli Sauce")){
            toppingIngredients = new ChilliSauce(pizzaHatStyle);
        } else if (type.equalsIgnoreCase("Meatball")){
            toppingIngredients = new Meatball(pizzaHatStyle);
        } else if (type.equalsIgnoreCase("Paprika")){
            toppingIngredients = new Paprika(pizzaHatStyle);
        } else if (type.equalsIgnoreCase("Sausage")){
            toppingIngredients = new Sausage(pizzaHatStyle);
        } else if (type.equalsIgnoreCase("Tomato")){
            toppingIngredients = new Tomato(pizzaHatStyle);
        } else if (type.equalsIgnoreCase("Tomato Sauce")){
            toppingIngredients = new TomatoSauce(pizzaHatStyle);
        }

        return toppingIngredients;
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza createdPizza = null;
        if (type.equalsIgnoreCase("Dough")){
            createdPizza = new BlackDoughPizzaHat();
        } else if (type.equalsIgnoreCase("Sides")){
            createdPizza = new CheesyBitesPizzaHat();
        }
        return createdPizza;
    }
}
