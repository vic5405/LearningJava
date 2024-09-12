public class arrays {

    public static void main(String[] args) {

        String[] colours = {"Blue","Red","Yellow"};//list of values in colour array
        colours[0] = "Orange";//replaces value at index 0, Blue with orange
        System.out.println(colours[0]);//prints out value in index 0

        //Another way to do arrays
        int[] numbers = new int[5];//new object numbers can hold 5 integers
        //stating the value in each index of the array
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;

        System.out.println(numbers[2]);
        //using for loop to print out the numbers array
        for (int i = 0; i < numbers.length; i++) {/*if counter is less than the length of numbers, increment 
                                                    through the list*/
            System.out.println(numbers[i]);//prints out the number the counter is on
        }

    }

}
