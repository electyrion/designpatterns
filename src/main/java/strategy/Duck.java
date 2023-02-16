package strategy;

import java.util.Random;

public abstract class Duck {

    protected String name;
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected EatBehavior eatBehavior;
    protected GetShotBehavior getShotBehavior;
    private int healthPoint;

    public Duck(String name){
        this.name = name;
        this.healthPoint = 100;
    }


    public void performQuack(){
        System.out.print(this.name+" ");
        quackBehavior.quack();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        System.out.print(this.name+" ");
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void performEat(){
        System.out.print(this.name+" ");
        eatBehavior.eat();
    }

    public void setEatBehavior(EatBehavior eatBehavior){
        this.eatBehavior = eatBehavior;
    }

    public void swim(){
        System.out.println(this.name+" Splash..splash..splash..");
    }

    public void setGetShotBehavior(GetShotBehavior getShotBehavior){
        this.getShotBehavior = getShotBehavior;
    }

    public void getShot(){
        int missChance = new Random().nextInt(10);
        if(missChance % 4 > 0){
            this.healthPoint = this.getShotBehavior.getShot(this.healthPoint);
        } else {
            System.out.println("Missed the shot for "+this.name);
        }
    }

    //Implemented by class who inherit this class
    public abstract void display();
}
