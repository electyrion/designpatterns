package factory.withfactory.templatefactory;

import factory.products.CrustySidesDomanoPizza;
import factory.products.Pizza;
import factory.products.SausageSidesDomanoPizza;

public class DomanoPizzaFactory implements PizzaFactory{

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
