import java.util.Scanner; 

public class countUpper {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Type something: "); 
		String str = input.nextLine(); 
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isUpperCase(str.charAt(i)))
				count++; 
		}
		System.out.println("The number of uppercase letters is " + count); 

		

	}

}
