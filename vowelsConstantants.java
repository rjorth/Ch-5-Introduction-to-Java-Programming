import java.util.Scanner; 

public class vowelsConstantants {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type something: ");
		
		String str = input.nextLine(); 

		int vowelCount = 0; 
		int consCount = 0; 
		
		for (int i = 0; i < str.length(); i ++) {
			
			if(Character.toUpperCase(str.charAt(i)) == 'A' ||
					Character.toUpperCase(str.charAt(i)) == 'E' ||
					Character.toUpperCase(str.charAt(i)) == 'O' ||
					Character.toUpperCase(str.charAt(i)) == 'I' ||
					Character.toUpperCase(str.charAt(i)) == 'U') {
				vowelCount++; 
			}
			else
				consCount++; 
					
					
			
		}
		System.out.println("The number of vowels is: " + vowelCount + "\nThe number of consonants is: "
				+ consCount++); 
		
		

	}

}
