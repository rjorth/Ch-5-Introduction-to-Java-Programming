import java.util.Scanner; 

public class EveryOtherChar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a word: "); 
		
		String word = input.next(); 
		
		String other = ""; 
		
		for (int i = 0; i < word.length(); i += 2) {
			other += word.charAt(i); 
		}
		
		System.out.println(other);
		

	}

}
