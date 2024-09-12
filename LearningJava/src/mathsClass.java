
public class mathsClass {

	public static void main(String[] args) {
		
		double x = 3.4;
		double y = -12;
	
		double z = Math.max(x, y);//finding the greater value between x and y
		double a = Math.min(x, y);//finding the lesser value between x and y

		double b = Math.abs(y);//absolute is always a non-negative value
		double c = Math.sqrt(y);//the square root function 
		double d = Math.round(x);//rounds up or down
		double e = Math.ceil(x);//rounds up always 
		double f = Math.floor(x);//rounds down always 
		
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);		
		System.out.println(c);
		System.out.println(e);
		System.out.println(f);

	}

}
