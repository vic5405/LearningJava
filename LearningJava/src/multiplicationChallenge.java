public class multiplicationChallenge {
/*Task: Display a multiplaation table up to 10
        Grid must have space between them*/

    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {//i is rows. when incrementing it counts 1 to 10 down
            for (int j = 1; j <= 10; j++)//j is columns. when incrementing it counts 1 to 10 across
            System.out.print((i*j)+" ");

        System.out.println();
        }
    }

}
