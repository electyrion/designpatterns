package template.brewing;

public abstract class BrewingCaffeineBeverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling to 100 degree celcius");
    }

    public void pourInCup(){
        System.out.println("Pouring");
    }



}
