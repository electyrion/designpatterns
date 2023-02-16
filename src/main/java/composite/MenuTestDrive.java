package composite;

public class MenuTestDrive {
    public static void main(String[] args){
        MenuComponent pancakeHouse = new Menu("Pancake House Menu", "All Pancake here");
        MenuComponent dinerHouse = new Menu("Diner House Menu", "Buffet here");
        MenuComponent dessertHouse = new Menu("Dessert House Menu", "All Dessert here");
        MenuComponent cafeHouse = new Menu("Cafe House Menu", "Coffee and Tea here");

        //Root
        MenuComponent allMenus = new Menu("All Menu", "All You can Get Menu");

        //Childs Dessert

        //1
        dessertHouse.add(new MenuElement("Nano Nano Candy", "Salty, Sweet, and Sour in one candy", false, 1.50));

        //2
        dessertHouse.add(new MenuElement("Ice Cream Cressendo", "Decreasing Flavor with every lick", false, 2.50));

        //Childs dari Pancake

        // 1
        pancakeHouse.add(dessertHouse);

        //2
        pancakeHouse.add(new MenuElement("Krunchy Pancake", "When eaten, it make crispy sound", false, 12.00));

        //3
        pancakeHouse.add(new MenuElement("Breakfast Pancake", "Pancake with maple syrup", true, 8.00));

        //4
        pancakeHouse.add(new MenuElement("Blueberry Pancake", "Pancake with blueberry syrup and the fruit itself", true, 11.00));

        //5
        pancakeHouse.add(new MenuElement("Nano Nano Pancake", "Salty, Sweet, and Sour in one pancake", false, 16.00));

        //Childs dari Cafe House
        cafeHouse.add(new MenuElement("Coffee", "Just Coffee", false, 5.00));
        cafeHouse.add(new MenuElement("Tea", "Just Tea", false, 3.00));

        //Childs dari Diner House
        dinerHouse.add(cafeHouse);
        dinerHouse.add(new MenuElement("Vegetarian Tofu Soup", "Only Tofu and Vegetable Here", true, 20.00));
        dinerHouse.add(new MenuElement("Beef Steak", "Meat...Meat..Meaty meat", true, 30.00));
        dinerHouse.add(new MenuElement("Fried Chicken with Honey Sauce", "Sweet honey saucec with Fried chicken", false, 25.00));
        dinerHouse.add(new MenuElement("Frizza", "Try this new Fried Pizza", false, 30.00));

        //Childs dari All Menu
        allMenus.add(pancakeHouse);
        allMenus.add(dinerHouse);

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();

    }
}
