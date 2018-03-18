import java.util.Scanner; 

public class SixTeenBits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: "); 
		
		short num = input.nextShort(); 
		
		String bits = ""; 
		
		for (int i = 0; i < 16; i++) {
			bits = (num & 1) + bits; 
			num >>= 1; 
		}
		System.out.println("The bits are " + bits);

	}

}
