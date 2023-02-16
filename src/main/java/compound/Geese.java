package compound;

public class Geese {
    private String name;
    private int honkCount;

    public Geese(String name) {
        this.name = name;
        this.honkCount = 0;
    }

    public void whoop(){
        System.out.println(this.name+" say whoop");
        this.honkCount++;
    }
}
