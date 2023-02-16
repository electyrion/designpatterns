package factory.withfactory.abstractfactory;

import factory.products.*;

public class DomanoPizzaProductsFactory implements ProductFactory{
    @Override
    public ToppingIngredients createTopping(String type) {
        ToppingIngredients toppingIngredients = null;
        String domanoPizzaStyle = "Domano Pizza Style";
        if (type.equalsIgnoreCase("Cheese")){
            toppingIngredients = new Cheese(domanoPizzaStyle);
        } else if (type.equalsIgnoreCase("Chilli Sauce")){
            toppingIngredients = new ChilliSauce(domanoPizzaStyle);
        } else if (type.equalsIgnoreCase("Meatball")){
            toppingIngredients = new Meatball(domanoPizzaStyle);
        } else if (type.equalsIgnoreCase("Paprika")){
            toppingIngredients = new Paprika(domanoPizzaStyle);
        } else if (type.equalsIgnoreCase("Sausage")){
            toppingIngredients = new Sausage(domanoPizzaStyle);
        } else if (type.equalsIgnoreCase("Tomato")){
            toppingIngredients = new Tomato(domanoPizzaStyle);
        } else if (type.equalsIgnoreCase("Tomato Sauce")){
            toppingIngredients = new TomatoSauce(domanoPizzaStyle);
        }
        return toppingIngredients;
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza createdPizza = null;

        if (type.equalsIgnoreCase("Dough")){
            createdPizza = new CrustySidesDomanoPizza();
        } else if (type.equalsIgnoreCase("Sides")){
            createdPizza = new SausageSidesDomanoPizza();
        }
        return createdPizza;
    }
}
