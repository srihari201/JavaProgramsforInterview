package programsWithoutUsingCollections;

public class SwapWithoutUsingThirdVariable {
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		System.out.println("Before Swapping num1=" + num1 + ",num2=" + num2);
		 num1=num1+num2;
		 num2=num1-num2;
		 num1=num1-num2;
		 System.out.println("After Swapping num1=" + num1 + ",num2=" + num2);
		
		
	}

}
