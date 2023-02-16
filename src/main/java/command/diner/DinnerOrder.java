package command.diner;

// This is Command Class
public class DinnerOrder implements Order {
    private CookingStaff cookingStaff;

    public DinnerOrder(CookingStaff cookingStaff) {
        this.cookingStaff = cookingStaff;
    }

    @Override
    public void execute() {
        cookingStaff.cookDinner();
    }
}
