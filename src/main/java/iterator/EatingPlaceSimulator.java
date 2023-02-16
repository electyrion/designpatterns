package iterator;

public class EatingPlaceSimulator {
    public static void main(String[] args){
        DinerHouseMenu dinerHouseMenu = new DinerHouseMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerHouseMenu);

        waitress.printAllMenu();

    }
}
