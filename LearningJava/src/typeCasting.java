
public class typeCasting {

	public static void main(String[] args) {
		int a = (int) 0.7;/*stores 0.7 as an integer
		                    type casting automatically rounds down*/
		
		System.out.println(a);
		
		byte b = 2;
		int ex = b;//able to store b as int ex because byte > int (1 byte > 4 bytes)
		
		System.out.println(ex);
		
		double c = 500.512;
		int rv = (int) c;//need to manually store double as int (8 bytes < 4 bytes)

		System.out.println(rv);
	}

}
