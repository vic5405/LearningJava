public class methods {

    public static void main(String[] args) {
        
        String name = "Victor";
        int age = 19;
        
        hello(name,age);/*calling upon the method 'hello' and want to pass argument name
                        and age.*/

        int x = 19;
        int y = 1;

        int z = add(x, y);
        System.out.println("\nYour age "+x+" add one more year is "+z);
    }

    static void hello(String name, int age) {/*we must make sure arguments & parameters are
                                               */
        System.out.println("Hello "+name);
        System.out.println("Your age is "+age);
    }

    static int add(int x, int y) {
        int z = x + y;
        return (z);
    }
}
