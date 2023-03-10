# Friday 10 March 2023

## Template

Template Design Pattern is a concept that is used in computer programming to `create a structure or a template that can be followed by other programs`. It is similar to a `blueprint` for building a house, where the blueprint provides a general plan for how the house should be constructed.

In programming, the template design pattern is used to `define the basic structure of a program`, including how different parts of the program should interact with each other. This helps to create more efficient and maintainable code, as developers can `follow the same structure and guidelines` throughout the development process.

Think of it like a recipe for cooking. When you follow a recipe, you typically follow a set of instructions in a particular order. For example, you might start by preparing the ingredients, then mixing them together, and finally baking the dish in the oven. This recipe provides a template that can be followed by anyone who wants to make the same dish.

Similarly, in programming, the template design pattern `provides a set of instructions or guidelines that can be followed by programmers` to create a particular type of program. By following this template, programmers can create more consistent and reliable code, which can be easier to maintain and modify in the future.

### Example

```java
public abstract class Game {
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();

    //template method
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}

public class Cricket extends Game {

    @Override
    protected void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}

public class Football extends Game {

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();        
    }
}
```
