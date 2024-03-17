package ProgramExample;

public class Swapping2 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 0;
		
		System.out.println("Before Swapping");
		System.out.println("x value is " +x);
		System.out.println("y value is " +y);
		
		
		x = x +y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swapping");
		System.out.println("x value is " +x);
		System.out.println("y value is " +y);
	}

}
