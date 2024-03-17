package ProgramExample;

public class ArmStrong {
	
	public static void main(String[] args) {
		int i,j=0;
		int a = 153;
		int b = a;
		
		
		while(a>0) {
			i=a%10;
			j = (i*i*i)+j;
			a = a/10;
		}
		
		
		System.out.println("ArmStronge value is " +j);
	}

}
