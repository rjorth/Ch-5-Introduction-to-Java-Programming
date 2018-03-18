import java.util.Scanner; 

public class Lottery {

	public static void main(String[] args) {
		
		int lottery;
		int first; 
		int second; 
		
		do {
			lottery = 10 + (int)(Math.random() * 90); 
			
			first = lottery / 10;
			second = lottery % 10; 
		}
		
		while (first == second);
		
			System.out.println(first + ""+ second  + "" + lottery); 
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter your lottery pick: "); 
			int guess = input.nextInt(); 
			
			int guessFirst = guess / 10; 
			int guessSecond = guess % 10; 
			
			System.out.println("The lottery number is " + lottery); 
			
			if (guess == lottery) 
				System.out.print("Correct, you win nothing"); 
			else if (guessSecond == first && guessFirst == second)
				System.out.println("Correct numbers, wrong order: you win nothing.");
			else if (guessFirst == first || guessSecond == first || guessSecond == second || guessFirst == second) {
				System.out.println("Match one digit: you win nothing.");
			
			}
			else 
				System.out.println("You lose");
		
		}
}
