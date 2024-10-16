package programsWithoutUsingCollections;

public class EvenOrOddInAnArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int lengthOfArray = a.length;
		System.out.println(lengthOfArray);
		for(int i=0;i<lengthOfArray;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i] + " is even ");
			}
			else {
				System.out.println(a[i] + " is odd ");
			}
		}

	}

}
