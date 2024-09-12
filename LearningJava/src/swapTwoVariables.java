
public class swapTwoVariables {

	public static void main(String[] args) {
		
		String x = "water";
		String y = "juice";
		String temp; /*or can set to null
		               creating a variable temp*/
		
		temp = x;//x is being temporarily stored in variable temp
		x=y;//storing x in y
		y=temp;//making y value be temp value, which is x
				
		System.out.println("x: "+x);
		System.out.println("y: "+y);

	}
}
