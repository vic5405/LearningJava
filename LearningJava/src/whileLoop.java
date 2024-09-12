import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?: ");
        String name = "";

        while (name.isBlank()) {/*if user input remains blank, while action will carrying on
                                  looping*/
            System.out.print("Enter your name");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);
        //do while loop
        int i = 1;

        System.out.println("You number is your number?");

        do {//block of code is executed then condition is checked 
            System.out.println("My number is: "+i);
            i++;
        } while (i <= 3);

    }

}
