package template.brewing;

public class Coffee extends BrewingCaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Brew the Coffee grinds");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
