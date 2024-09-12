import java.util.Random;

public class main {

    public static void main(String[] args) {
        
        Random random = new Random();

        float x = random.nextFloat(0) +1;
        float y = random.nextFloat();
        float z = random.nextFloat();        

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}