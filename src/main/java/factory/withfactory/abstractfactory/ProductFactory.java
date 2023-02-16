package factory.withfactory.abstractfactory;

import factory.products.Pizza;
import factory.products.ToppingIngredients;

public interface ProductFactory {
    public ToppingIngredients createTopping(String type);
    public Pizza createPizza(String type);
}
