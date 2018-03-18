
public class Five13 {

	public static void main(String[] args) {
		
		int n = 0;
		
		while (Math.pow(n, 3) < 12000) {
			n++;
		}
		
		System.out.print("The largest integer that is less than 12,000 when cubed is " +
				(n-1) + ".\nWhen cubed: " + Math.pow(n - 1, 3)); 
		System.out.print("\nProof: " + n + "\nWhen cubed: " + (Math.pow(n, 3))); 

	}

}
