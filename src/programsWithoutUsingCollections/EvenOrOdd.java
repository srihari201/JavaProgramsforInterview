package programsWithoutUsingCollections;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner (System.in)) {
			System.out.println("Enter the number:");
			int number=scanner.nextInt();
			if(number %2==0) {
				System.out.println(number + " is even ");
			}
			else {
				System.out.println(number + " is odd ");
			}
		}
		

	
	
	}

}
