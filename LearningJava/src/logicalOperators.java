import java.util.Scanner;

public class logicalOperators {

    public static void main(String[] args) {
        
        //&& = (AND) example
        int temp = 25;

        if (temp>=30) {
            System.out.println("It is hot outside");
        }
        else if (temp>=20 && temp<30) {//both statements msut be true for it to execute
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is hot outside");
        }

        //|| = (OR) exmaple
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game. Press q pr Q to quit");
        String response =scanner.next();

        if (response.equals("q")|| response.equals("Q")) {/*user must input 
                                    either q or Q to exit the game*/
            System.out.println("You quit the game");
        }
        else {//anyhting else inputted will execute the else action 
            System.out.println("You are still playing the game");
        }

        boolean fit = true;

        if (!fit) {//if the variable fit is not true then we execute if statement 
            System.out.println("You are not fit");
        }
        else {//if varaible fit is true else statement is executed 
            System.out.println("You are fit!");
        }

    }

}
