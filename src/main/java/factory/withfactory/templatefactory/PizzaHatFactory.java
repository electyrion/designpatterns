package factory.withfactory.templatefactory;

import factory.products.BlackDoughPizzaHat;
import factory.products.CheesyBitesPizzaHat;
import factory.products.Pizza;

public class PizzaHatFactory implements PizzaFactory {
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
