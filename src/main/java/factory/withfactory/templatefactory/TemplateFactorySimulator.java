package factory.withfactory.templatefactory;

import factory.products.Pizza;

public class TemplateFactorySimulator {
    public static void main(String[] args){
        NPCPizzaStore npcPizzaStore = new NPCPizzaStore();

        Pizza blackDoughPizza = npcPizzaStore.orderPizza("Dough");
        System.out.println(blackDoughPizza);

    }
}
