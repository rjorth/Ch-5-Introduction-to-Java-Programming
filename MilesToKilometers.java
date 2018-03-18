
public class MilesToKilometers {

	public static void main(String[] args) {
	
		
		final double kilos = 1.609;
		
		System.out.println("Miles        Kilometers"); 
		
		for(int miles = 1; miles <= 10; miles++) {
			System.out.printf("%-13d%-10.3f\n", miles, (miles * kilos));
		}
	}
}
