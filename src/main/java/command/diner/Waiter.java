package command.diner;

//This is Invoker
public class Waiter {
    void placeOrder(Order order){
        order.execute();
    }
}
