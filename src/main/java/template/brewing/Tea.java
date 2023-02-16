package template.brewing;

public class Tea extends BrewingCaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Steep the Teabag");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add Lemon");
    }
}
