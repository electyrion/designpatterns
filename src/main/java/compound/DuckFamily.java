package compound;

import java.util.ArrayList;

class RubberDuck{

    private String name;
    private int quackingCount;

    public int getQuackingCount() {
        return quackingCount;
    }

    public RubberDuck(String name) {
        this.name = name;
        this.quackingCount = 0;
    }


    public void quack() {
        System.out.println(this.name+" say Squeak...Squeak");
        this.quackingCount++;
    }
}

class LiveDuck{

    private String name;
    private int quackingCount;

    public int getQuackingCount() {
        return quackingCount;
    }

    public LiveDuck(String name) {
        this.name = name;
        this.quackingCount = 0;
    }


    public void quack() {
        System.out.println(this.name+" say Quack...Quack");
        this.quackingCount++;
    }
}

class WoodenDuck{

    private String name;
    private int quackingCount;

    public WoodenDuck(String name) {
        this.name = name;
        this.quackingCount = 0;
    }

    public void quack() {
        System.out.println(this.name+" say nothing");
        this.quackingCount++;
    }

    public int getQuackingCount() {
        return quackingCount;
    }
}

public class DuckFamily{
    public static void main(String[] args){
        DuckFamily duckFamily = new DuckFamily();
        duckFamily.duckSpawner();

    }

    public void duckSpawner(){
        RubberDuck rubberDuck1 = new RubberDuck("Boogie 1");
        RubberDuck rubberDuck2 = new RubberDuck("Boogie 2");
        RubberDuck rubberDuck3 = new RubberDuck("Boogie 3");
        RubberDuck rubberDuck4 = new RubberDuck("Boogie 4");
        RubberDuck rubberDuck5 = new RubberDuck("Boogie 5");

        LiveDuck liveDuck1 = new LiveDuck("Daffy Duck");
        LiveDuck liveDuck2 = new LiveDuck("Donald Duck");
        LiveDuck liveDuck3 = new LiveDuck("Huey Duck");
        LiveDuck liveDuck4 = new LiveDuck("Dewey Duck");
        LiveDuck liveDuck5 = new LiveDuck("Louie Duck");

        WoodenDuck woodenDuck1 = new WoodenDuck("Woody Duck");
        WoodenDuck woodenDuck2 = new WoodenDuck("Cracker Duck");
        WoodenDuck woodenDuck3 = new WoodenDuck("Curnchy Duck");

        rubberDuck1.quack();
        rubberDuck2.quack();
        rubberDuck3.quack();
        rubberDuck4.quack();
        rubberDuck5.quack();

        liveDuck1.quack();
        liveDuck2.quack();
        liveDuck3.quack();
        liveDuck4.quack();
        liveDuck5.quack();

        woodenDuck1.quack();
        woodenDuck2.quack();
        woodenDuck3.quack();

        Geese geese1 = new Geese("White Geese");
        Geese geese2 = new Geese("Black Geese");

        Swan swan1 = new Swan("White Swan");
        Swan swan2 = new Swan("Black Swan");

        ArrayList ducklist = new ArrayList();

        ducklist.add(rubberDuck1);
        ducklist.add(rubberDuck2);
        ducklist.add(rubberDuck3);
        ducklist.add(rubberDuck4);
        ducklist.add(rubberDuck5);

        ducklist.add(liveDuck1);
        ducklist.add(liveDuck2);
        ducklist.add(liveDuck3);
        ducklist.add(liveDuck4);
        ducklist.add(liveDuck5);

        ducklist.add(woodenDuck1);
        ducklist.add(woodenDuck2);
        ducklist.add(woodenDuck3);

        ArrayList swanlist = new ArrayList();

        swanlist.add(swan1);
        swanlist.add(swan2);

        ArrayList geeselist = new ArrayList();

        geeselist.add(geese1);
        geeselist.add(geese2);

        System.out.println("Total Duck in Simulator is "+ducklist.size());
        System.out.println("Total Geese in Simulator is "+geeselist.size());
        System.out.println("Total Swan in Simulator is "+swanlist.size());

    }

}