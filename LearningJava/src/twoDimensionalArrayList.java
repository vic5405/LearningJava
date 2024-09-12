import java.util.*;

public class twoDimensionalArrayList {

    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();//array list that stores other array lists    

        ArrayList<String> bakeryList = new ArrayList<>();//adding elements to differnt array lists
        bakeryList.add("Donuts");
        bakeryList.add("Pastry");
        bakeryList.add("Bread");
        
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Pear");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Soda");
        drinkList.add("Coffee");

        groceryList.add(bakeryList);//adding the array lists to one array list. an array list to hold several array lists
        groceryList.add(fruitList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(0).get(2));/*first .get method calls the array list in that index.
                                                                    second .get methods calls the element on that array list*/
    }
} 