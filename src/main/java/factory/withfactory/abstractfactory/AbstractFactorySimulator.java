package factory.withfactory.abstractfactory;

import factory.products.BlackDoughPizzaHat;
import factory.products.Pizza;

public class AbstractFactorySimulator {



    public static void main(String[] args){
        ProductFactory pizzaHatProductsFactory = new PizzaHatProductsFactory();
        ProductFactory domanoPizzaProductsFactory = new DomanoPizzaProductsFactory();
        PizzaStore pizzaStore = new PizzaStore();

        //Try to use Pizza Hat
        pizzaStore.setPizzaFactory(pizzaHatProductsFactory);

        Pizza blackDoughPizzaHat = pizzaStore.orderPizza("Dough");
        blackDoughPizzaHat.addTopping(pizzaStore.createToppingForPizza("Tomato"));
        System.out.println(blackDoughPizzaHat.getName());
        System.out.println(blackDoughPizzaHat.getAllToppings().toString());
    }
}
