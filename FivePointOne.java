import java.util.Scanner;

public class FivePointOne {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int positives = 0;
	int negatives = 0;
	int count = 0;
	double total = 0;
	
	System.out.print("Enter an integer, the program ends if it is 0: ");
	int number = input.nextInt(); 
	
	if (number == 0) {
		System.out.println("You entered 0");
		System.exit(1);
		
	}
	while (number != 0) {
		if (number > 0) 
			positives++; 
		else
			negatives++; 
		total += number; 
		count++; 
		number = input.nextInt(); 
	}
	double average = total/count; 
	
	System.out.println("The number of positives is " + positives + "\n" +
			"The number of negatives is " + negatives + "\n" + "The total is " + total +
			"\nThe average is " + average); 
			
	
	
	}
 
	
	
	

}
