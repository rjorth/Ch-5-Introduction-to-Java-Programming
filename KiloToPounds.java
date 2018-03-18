
public class KiloToPounds {

	public static void main(String[] args) {
		
		final double pounds = 2.2;
		System.out.println("Kilograms       Pounds");
		
		for(int kilo = 1; kilo <= 199; kilo +=2) {
			System.out.printf(
					"%-13d%6.1f\n", kilo, (kilo * pounds)); 
		}

	}

}
