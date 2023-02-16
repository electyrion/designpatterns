package strategy;

public class DuckSimulator {
    public static void main(String[] args){

        System.out.println("---Duck who like to Eat, Fly, and Quack---");
        Duck aDuck = new DuckA("Abra");
        aDuck.performEat();
        aDuck.performFly();
        aDuck.performQuack();

        System.out.println("\n---Duck who only Squeak---");
        Duck fDuck = new DuckF("Farfetch\'D");
        fDuck.performEat();
        fDuck.performFly();
        fDuck.performQuack();

        System.out.println("\n---Duck who like to Eat, and Quack---");
        Duck kDuck = new DuckK("King");
        kDuck.performEat();
        kDuck.performFly();
        kDuck.performQuack();

        System.out.println("\n---Duck who like to Eat, and Fly---");
        Duck pDuck = new DuckP("Punk");
        pDuck.performEat();
        pDuck.performFly();
        pDuck.performQuack();

        System.out.println("\n---Duck who like to Fly, and Squeak---");
        Duck uDuck = new DuckU("Ultra");
        uDuck.performEat();
        uDuck.performFly();
        uDuck.performQuack();

    }
}
