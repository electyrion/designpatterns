package command.diner;

public class BreakfastOrder implements Order{

    CookingStaff cookingStaff;

    public BreakfastOrder(CookingStaff cookingStaff){
        this.cookingStaff = cookingStaff;
    }

    @Override
    public void execute() {
        cookingStaff.cookBreakfast();
    }
}
