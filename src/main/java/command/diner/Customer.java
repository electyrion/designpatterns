package command.diner;

//This is a Client
public class Customer {
    public static void main(String []args){
        CookingStaff aCook = new CookingStaff();
        CookingStaff bCook = new CookingStaff("Bee");

        BreakfastOrder aBreakfast = new BreakfastOrder(aCook);
        LunchOrder aLunch = new LunchOrder(aCook);
        DinnerOrder aDinner = new DinnerOrder(aCook);

        BreakfastOrder bBreakfast = new BreakfastOrder(bCook);
        LunchOrder bLunch = new LunchOrder(bCook);
        DinnerOrder bDinner = new DinnerOrder(bCook);

        Waiter waiter = new Waiter();

        waiter.placeOrder(aBreakfast);
        waiter.placeOrder(aLunch);
        waiter.placeOrder(aDinner);

        waiter.placeOrder(bBreakfast);
        waiter.placeOrder(bLunch);
        waiter.placeOrder(bDinner);


    }
}
