package factory.withfactory.templatefactory;

import factory.products.Pizza;

public interface PizzaFactory {
    public Pizza createPizza(String type);
}
