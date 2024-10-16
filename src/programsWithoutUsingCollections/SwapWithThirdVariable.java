package programsWithoutUsingCollections;

public class SwapWithThirdVariable {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 14;
		System.out.println("Before Swapping: num1=" + num1 + " ,num2=" + num2);
		// Swap using third variable
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swappint: num1=" + num1 + " ,num2=" + num2);

	}

}
