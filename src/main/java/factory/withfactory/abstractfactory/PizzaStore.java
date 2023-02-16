package factory.withfactory.abstractfactory;

import factory.products.Pizza;
import factory.products.ToppingIngredients;

public class PizzaStore {
    ProductFactory productFactory;

    public PizzaStore() {
    }

    public void setPizzaFactory(ProductFactory productFactory){
        this.productFactory = productFactory;
    }

    public Pizza orderPizza(String type){
        return this.productFactory.createPizza(type);
    }

    public ToppingIngredients createToppingForPizza(String type){
        ToppingIngredients selectedTopping = this.productFactory.createTopping(type);
        return selectedTopping;
    }
}
