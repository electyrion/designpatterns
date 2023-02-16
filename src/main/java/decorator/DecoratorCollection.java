package decorator;

abstract class CondimentDecorator extends Beverage{

    public abstract String getDescription();
}

class Milk extends CondimentDecorator{

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1.00;
    }
}

class Syrup extends CondimentDecorator {

    Beverage beverage;

    public Syrup(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Syrup";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1.50;
    }
}

class WhipCream extends CondimentDecorator {

    Beverage beverage;

    public WhipCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip Cream";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 2.00;
    }
}

class Chocolate extends CondimentDecorator {

    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 3.00;
    }
}