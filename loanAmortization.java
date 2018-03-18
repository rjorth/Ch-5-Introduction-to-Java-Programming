import java.util.Scanner; 

public class loanAmortization {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Loan Amount: "); 
		double loan = input.nextDouble(); 
		
		System.out.printf("Number of years: "); 
		int years = input.nextInt(); 
		
		System.out.print("Annual Interest Rate: "); 
		double annualRate = input.nextDouble(); 
		
		double monthlyRate = annualRate / 1200;
		
		double monthlyPayment = loan * monthlyRate / (1 - Math.pow(1 / 1 + monthlyRate, years * 12));
		double balance = loan; 
		double interest; 
		double principal; 
		
		System.out.println("Monthly Payment: " + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("Total payment: " + (int) (monthlyPayment * 12 * years * 100) / 100.0 + "\n");
		
		System.out.println("Payment#\tInterest\tPrinciple\tBalance"); 
		for (int i = 1; i <= years * 12; i++) {
            interest = (int)(monthlyRate * balance * 100) / 100.0;
            principal = (int)((monthlyPayment - interest) * 100) / 100.0;
            balance = (int)((balance - principal) * 100) / 100.0;
            System.out.println(i + "\t\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
			
	}
	}
}


