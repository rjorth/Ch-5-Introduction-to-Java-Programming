import java.util.Scanner; 
public class LargeOccurence {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		int largest = 0; 
		int occ = 1; 
		int number;
		
		System.out.println("Enter numbers: ");
		
		while (input.hasNext()) {
			number = input.nextInt(); 
			if (number > largest) 
				largest = number;
			else if (number == largest) 
				occ++; 
			else if (number == 0) {
				
				System.out.println("The largest number is " + largest + 
				"\nIt occurs " + occ + " times."); 
				System.exit(1);
			}

				
	}
	}

}
