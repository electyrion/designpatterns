package adapter;


interface GobbleBehavior {
    public void gobble();
}

class GobbleLoudlyBehavior implements GobbleBehavior {
    @Override
    public void gobble() {
        System.out.println("GOBBLE..GOBBLE..GOBBLE");
    }
}

class MuteGobbleBehavior implements GobbleBehavior {

    @Override
    public void gobble() {
        System.out.println("<gobble>");
    }
}
