package ProgramExample;

public class EvenAndOdd {
	
	public static void main(String[] args) {
		
		int EvenCount = 0;
		int OddCount = 0;
		int OddSum = 0;
		int EvenSum = 0;
		
		for(int i = 0; i<=100; i++) {
			if(i%2 == 0) {
				EvenCount = EvenCount + 1;
				EvenSum = EvenSum + i;
				System.out.println("Even Number " +i) ;
			}
			else {
				OddCount = OddCount + 1;
				OddSum = OddSum + i;
				System.out.println("Odd Number " +i);
			}
		
		}
		
		System.out.println("Even Number Count is " +EvenCount);
		System.out.println("Odd Number Count is " +OddCount);
		System.out.println("Even Sum  is " +EvenSum);
		System.out.println("Odd Sum  is " +OddSum);
	}

}
