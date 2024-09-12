import java.util.Scanner;//importing the sanner class

public class hypotenuse {
    public static void main(String[] args) {
        
        double x;//values for the sides
        double y;
        double z;//result

        Scanner scanner = new Scanner(System.in);//user input

        System.out.println("Enter side x: ");//print out question 
        x = scanner.nextDouble();//User input
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));//hypotenuse formula = c = sqrt of a^2 + b^2

        System.out.println("The hypotenuse is "+z);//prints out message + z

        scanner.close();
    }
}
