package factory.nofactory;

import factory.products.*;

public class PizzaSimulator {


    // Changes in the concrete class will result a lot of code changes here
    // Tight couple between Client (High-Level Component) and Low-Level Component

    public static void main(String[] args){

        CheesyBitesPizzaHat cheesyBitesPizzaHat = new CheesyBitesPizzaHat();

        //Cheesy Bites Pizza Topping
        Cheese belgianCheese = new Cheese("Belgian Cheese");
        Tomato slicedTomato = new Tomato("Sliced Tomato");
        cheesyBitesPizzaHat.addTopping(belgianCheese);
        cheesyBitesPizzaHat.addTopping(slicedTomato);

        SausageSidesDomanoPizza sausageSidesDomanoPizza = new SausageSidesDomanoPizza();

        // Sausage Side Pizza Topping
        Meatball spicyMeatball = new Meatball("Spicy Meatball");
        Paprika greenPaprika = new Paprika("Green Paprika");
        sausageSidesDomanoPizza.addTopping(spicyMeatball);
        sausageSidesDomanoPizza.addTopping(greenPaprika);


    }

}
