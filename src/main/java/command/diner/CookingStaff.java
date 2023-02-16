package command.diner;

// This is Receiver
public class CookingStaff {

    private String name;

    public CookingStaff(String name){
        this.name = name;
    }

    public CookingStaff(){
        this.name = "Default";
    }

    public void cookBreakfast() {
        System.out.println(this.name+" say Breakfast is in progress!!!");
    }

    public void cookLunch() {
        System.out.println(this.name+" say Lunch is in progress!!!");
    }

    public void cookDinner() {
        System.out.println(this.name+" say Dinner is in progress!!!");
    }
}

