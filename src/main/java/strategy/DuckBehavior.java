package strategy;

interface QuackBehavior {
    public void quack();
}

interface EatBehavior {
    public void eat();
}

class Quack implements QuackBehavior{
    public Quack(){}

    public void quack(){
        System.out.println("quack quack");
    }
}

class Squeak implements QuackBehavior{
    public Squeak(){}

    public void quack(){
        System.out.println("squeak squeak");
    }
}

class MuteQuack implements QuackBehavior{
    public MuteQuack(){}

    public void quack(){
        System.out.println("<mute>");
    }
}

class EatFood implements EatBehavior{
    public EatFood(){}

    public void eat(){
        System.out.println("like to eat good food");
    }
}

class NoEating implements EatBehavior{
    public NoEating(){}

    public void eat(){
        System.out.println("can live even without food");
    }
}