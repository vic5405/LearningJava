public class ifStatements {

    public static void main(String[] args) {
        
        int age = 17;

        if(age >= 75) {
            System.out.println("Okay Boomer");
        }
        else if (age >= 18) {//if age variable is greater or equal to 18 if Statement will print
            System.out.println("You are an adult");
        }
        else {//else Statement prints otherwise 
            System.out.println("You are a minor");
        }

    }

}
