public class twoDimensionalArrays {

    public static void main(String[] args) {
        
        String[][] animals = new String[2][2];

        animals[0][0] = "dog";
        animals[0][1] = "cat";
        animals[1][0] = "bird";
        animals[1][1] = "bear";

        for(int i = 0; i < animals.length; i++) {
            System.out.println();
            for (int j = 0; j < animals[i].length; j++) {
                System.out.print(animals[i][j]+" ");
            }

        }
    }
}
