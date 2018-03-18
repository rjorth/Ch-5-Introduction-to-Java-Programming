import java.util.Scanner; 

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter a word: "); 
		
		String word = input.next(); 
		
		String reverse = ""; 
		
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i); 
		}
		System.out.println("The reverse is " + reverse); 
		

	}

}
