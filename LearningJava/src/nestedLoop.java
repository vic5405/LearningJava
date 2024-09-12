public class nestedLoop {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {//counter increments if condition is true
            for (int j = 1; j <= i; j++)
            /*j resets after every sysout. so i = 1, j = 1, j is <= i so we don't increment.
             * second for loop so i = 2, j = 1, j is not <=2 so increment by 1 to match
             * the for loop repeats until outer loop condition is met
            */
                System.out.print("*"+ " ");//this prints out 
        
            System.out.println();//a new line after every nested for loop 

        }
    }

}
