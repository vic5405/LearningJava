import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        
        ArrayList<String> food = new ArrayList<String>();

        food.add("ice cream");//adding elements to ArrayList
        food.add("cake");
        food.add("sweet");

        food.set(1, "cheesecake");//replacing value in index with new value 
        food.remove(0);//remvoves value in a index
        food.clear();//clears entire list

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
