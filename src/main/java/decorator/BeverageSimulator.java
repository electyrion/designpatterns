package decorator;

public class BeverageSimulator {
    public static void main(String[] args){
        Beverage tea = new TehPociTea();

        CondimentDecorator milk = new Milk(tea);
        CondimentDecorator chocolate = new Chocolate(milk);
        CondimentDecorator syrup = new Syrup(chocolate);
        System.out.println(syrup.cost());

    }
}
