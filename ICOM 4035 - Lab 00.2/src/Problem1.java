import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		int userFunction, requests;
		
		System.out.println("Enter the number of requests: ");
		requests = scan.nextInt();
		
		if (requests > 0) {
			System.out.println("Enter \"1\", separated by a space, with the number to add in the array.");
			System.out.println("Enter \"2\", separated by a space, with the number to remove from the array.");
			System.out.println("Enter \"3\", to show the size of the array.");
			do {
				userFunction = scan.nextInt();
				
				// "1 X" put X at the end of ArrayLIst
				if (userFunction == 1) {
					int number = scan.nextInt();
					a.add(number);
					System.out.println(a);
				}
				
				// "2 Y" remove all Y’s from ArrayList
				else if (userFunction == 2) {
					int number = scan.nextInt();
					for (int i=1; i<a.size(); i++) {
						if (number == a.get(i)) {
							a.remove(i);
						}
					}
					System.out.println(a);
				}
				
				// "3" print the size of ArrayList
				else if (userFunction == 3) {
					System.out.println("The size of the array is " + a.size() + ".");
				}
				
				//Undefined userFunction values
				else if (userFunction == 0 || userFunction > 4) {
					System.out.println("Invalid input, the request was not processed.");
					System.out.println("Enter \"1\", separated by a space, with the number to add in the array.");
					System.out.println("Enter \"2\", separated by a space, with the number to remove from the array.");
					System.out.println("Enter \"3\", to show the size of the array.");
					requests++;
				}
				requests--;
			} while (requests > 0);
		}
		else {
			System.out.println("0 requests to process.");
		}
	}
}