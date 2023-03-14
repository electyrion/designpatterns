# Friday 10 March 2023

## Command

The command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time. This information includes the method name, the object that owns the method and values for the method parameters.

The Command pattern is a design pattern that is used in computer programming to organize code and make it more `flexible` and `reusable`. At its core, it involves `separating the behavior of an object from the object itself`.

Imagine that you have a set of instructions that you want someone to follow. Instead of giving them all of the steps at once, you give them one step at a time, and `each step is encapsulated in a separate instruction`. The person can then execute each instruction in turn, and they don't need to know anything about the other steps that are involved.

In the same way, the Command pattern separates the behavior of an object from the object itself, and `encapsulates that behavior in a separate command object`. This makes it easier to `modify the behavior of an object`, and also allows the behavior to be reused in different contexts.

For example, let's say you have a TV remote control. Instead of the remote control directly sending commands to the TV, it creates separate command objects for each action (such as turning on/off the TV, changing the channel, or adjusting the volume), and then sends those commands to the TV. This allows you to add new commands (such as muting the TV) without having to modify the remote control or the TV itself.

In short, the Command pattern is a way of encapsulating behavior in separate objects, which makes code more flexible, reusable, and easier to modify.

### Example

```java
public class CommandPatternExample {
    public static void main(String[] args) {
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);

        Switch mySwitch = new Switch(switchUp, switchDown);

        try {
            if (args[0].equalsIgnoreCase("ON")) {
                mySwitch.flipUp();
            } else if (args[0].equalsIgnoreCase("OFF")) {
                mySwitch.flipDown();
            } else {
                System.out.println("Argument \"ON\" or \"OFF\" is required.");
            }
        } catch (Exception e) {
            System.out.println("Arguments required.");
        }
    }
}

interface Command {
    void execute();
}

class FlipUpCommand implements Command {
    private Light theLight;

    public FlipUpCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }
}

class FlipDownCommand implements Command {
    private Light theLight;

    public FlipDownCommand(Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }
}

class Light {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("The light is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("The light is off");
    }

    public boolean isOn() {
        return isOn;
    }
}

class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCmd, Command flipDownCmd) {
        this.flipUpCommand = flipUpCmd;
        this.flipDownCommand = flipDownCmd;
    }

    public void flipUp() {
        flipUpCommand.execute();
    }

    public void flipDown() {
        flipDownCommand.execute();
    }
}
```
