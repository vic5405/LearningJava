public class printf {

    public static void main(String[] args) {

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Victor";
        int myInt = 50;
        double myDouble = 2400;

        // [coversion-character] how  to print differnt data types
        System.out.printf("%b", myBoolean);
        System.out.printf("\n%c", myChar);
        System.out.printf("\n%s", myString);
        System.out.printf("\n%d", myInt);
        System.out.printf("\n%f", myDouble);

        // [width] add characters spaces to output
        System.out.printf("\nHello %10s", myString);

        // [precision] how decimal a number is to
        System.out.printf("\nThis is pie to 2 decimals %.2f", myDouble);
        // [flags] add effects to output
        /* - = left justfy
         * + = outputs (+) or (-) sign for numeric value 
         * 0 = numeric values zero-padded
           , = sperator if number > 1000 */ 
        System.out.printf("\nYou have this much money %-20.2f", myDouble);
        System.out.printf("\nYou have this much money %+f", myDouble);
        System.out.printf("\nYou have this much money %05f", myDouble);
        System.out.printf("\nYou have this much money %,f", myDouble);
    }
}
 