import java.util.Scanner;
public class LoansTable {

	public static void main(String[] args) {
		
		double annualRate = 5.00;

        
        Scanner input = new Scanner(System.in);

        
        System.out.printf("Loan amount: ");
        double loan = input.nextDouble();

        
        System.out.print("Number of Years: ");
        int years = input.nextInt();

        

        System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment","Total Payment");
       
        for ( ; annualRate <= 8.00; annualRate += 0.125) {

            
            double monthlyRate = annualRate / 1200;
            double monthlyPayment = loan * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));

            double totalPayment = monthlyPayment * years * 12;

            
            String str = "%";

        
            System.out.printf("%-1.3f%s%17.2f%24.2f \n",annualRate ,
            		str, ((int)(monthlyPayment * 100) / 100.0), 
            		((int)(totalPayment * 100) / 100.0));

        }

    }
}

