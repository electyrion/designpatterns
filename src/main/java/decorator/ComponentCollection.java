package decorator;

class GreenTea extends Beverage {

    public GreenTea() {
        description = "Green Tea";
    }

    @Override
    public double cost() {
        return 7.50;
    }
}

class SariwangiTea extends Beverage {

    public SariwangiTea() {
        description = "Sariwangi Tea";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}

class TehPociTea extends Beverage{

    public TehPociTea() {
        description = "Teh Poci Tea";
    }

    @Override
    public double cost() {
        return 3.50;
    }
}

class ArabianCoffee extends Beverage{

    public ArabianCoffee() {
        description = "Arabian Coffee";
    }

    @Override
    public double cost() {
        return 7.00;
    }
}

class LuwakWhiteCoffee extends Beverage{

    public LuwakWhiteCoffee() {
        description = "Luwak White Coffee";
    }

    @Override
    public double cost() {
        return 8.00;
    }
}

class LocalIndonesianCoffee extends Beverage{

    public LocalIndonesianCoffee() {
        description = "Local Indonesian Coffee";
    }

    @Override
    public double cost() {
        return 7.50;
    }
}
