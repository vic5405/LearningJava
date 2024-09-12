import java.util.Scanner;//importing a library (scanner)


public class userInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);/*using the scanner class to create a new object.
		                                           Allows for user input*/
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();/*String variable name requires user to enter in a string. 
		 								   User inputs on the next line*/
		System.out.println("How old are you?");
		int age = scanner.nextInt();/*Integer variable age requires user to enter in an integer. 
		   							  User inputs on the next line which is evaluated*/
		scanner.nextLine();//placed after 'nextInt' to reset scanner
		System.out.println("What is your favourite food?");
		String food = scanner.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+food);

		scanner.close();

	}

}
