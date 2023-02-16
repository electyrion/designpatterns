package factory.withfactory.templatefactory;

import factory.products.Pizza;

public class NPCPizzaStore {
    PizzaFactory pizzaFactory;

    public NPCPizzaStore() {
        this.pizzaFactory = new PizzaHatFactory();
    }

    public Pizza orderPizza(String type){
        return this.pizzaFactory.createPizza(type);
    }
}
