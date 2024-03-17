package ProgramExample;

public class Swapping3 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 0;
		
		System.out.println("Before Swapping");
		System.out.println("x value is " +x);
		System.out.println("y value is " +y);
		
		
		z = y;
		y= x;
		x = z;
		
		System.out.println("After Swapping");
		System.out.println("x value is " +x);
		System.out.println("y value is " +y);
		
		
	}

}
