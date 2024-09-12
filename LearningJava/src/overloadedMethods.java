public class overloadedMethods {

    public static void main(String[] args) {
        
        double x = add(1.0,2.0,3.0);/*outcome is method #5. 3 parameters of double outcome
                                            = double a, b, c*/ 
        System.out.println(x);
    }

    static int add(int a, int b) {//same arguments but different parameters for each method
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
    
    static double add(double a, double b) {//we can also do this for double. just need to chage the argument
        System.out.println("This is overloaded method #4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("This is overloaded method #5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloaded method #6");
        return a + b + c + d;
    }
}
