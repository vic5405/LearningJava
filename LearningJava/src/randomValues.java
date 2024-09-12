import java.util.Random;

public class randomValues {

    public static void main(String[] args) {
        
        Random random = new Random();//creates a Random object

        int x = random.nextInt();//generates random number
        int y = random.nextInt(6);//generates randomly between 0 and 6
        int z = random.nextInt(6)+1;//generates randomly between 1 and 6


        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
