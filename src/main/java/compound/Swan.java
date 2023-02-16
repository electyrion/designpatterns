package compound;

public class Swan {

    private String name;
    private int whoopCount;

    public Swan(String name) {
        this.name = name;
        this.whoopCount = 0;
    }

    public void whoop(){
        System.out.println(this.name+" say whoop");
        this.whoopCount++;
    }
}
