
public class expressions {

	public static void main(String[] args) {
		
		//expression = operands & operators
		//operands = values, variables, numbers, quantity
		//operators = + - * / %
		
		
		double friends = 10;
		
		//friends = friends + 3; here we are using adding operator onto the operand friends by 3
		/*friends++; = increment = prints out 11 
		 *friends--; = decrement = prints out 9*/ 
		
		friends = (double) friends / 3;/*friends is an int so to cast a double 
										 we have to change friends from int -> double (line 10)*/
		
		System.out.println(friends);
	}

}
