public class stringMethods {

    public static void main(String[] args) {

        String name = " Victor   ";

        boolean a = name.equalsIgnoreCase("Victor");/*is name the same as vairable a.
                                                                    it ignores what case the v is */
        int b = name.length();//gives back length of string variable name 
        char c = name.charAt(2);//identify character in the index 2
        boolean d = name.isEmpty();//checks to see if string name has no value
        String e = name.toUpperCase();//changes all characters in string to upper case
        String f = name.toLowerCase();//changes all characters in string to lower case
        String g = name.trim();//removes extra spaces 
        String h = name.replace('V', 'b');//replaces a cahracter with another one

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }

}
