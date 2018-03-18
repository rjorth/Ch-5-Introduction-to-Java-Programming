import java.util.Scanner;

public class RockPaperS {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		int compWins = 0; 
		int userWins = 0; 
		
		System.out.println("You have entered a rock, paper, scissors tournament." +
				"\nThe winner must win by at least 2 rounds.");
		
		while (Math.abs(compWins - userWins) <= 2) {
			
			
			System.out.print("Enter 0 for scissors, 1 for rock, or 2 for paper: ");
			int choice = input.nextInt(); 
			int compChoice = (int)(Math.random() * 3); 
			String strComp = ""; 
			
			switch (compChoice) {
			case 0: strComp = "scissors"; break;
			case 1: strComp = "rock"; break;
			case 2: strComp = "paper"; break;
			}
			
			String strUserChoice = ""; 
			switch (choice) {
			case 0: strUserChoice = "scissors"; break; 
			case 1: strUserChoice = "rock"; break; 
			case 2: strUserChoice = "paper"; break; 
			default: 
				System.out.print("Invalid"); 
				System.exit(0); 
			}
			System.out.print("The computer is " + strComp + ". You are " + strUserChoice); 
			
			if (compChoice == choice) {
				System.out.println(" too. It's a draw."); 
			}
			else if ((compChoice == 2 && choice == 1) || 
					(compChoice == 1 && choice == 0) || 
					(compChoice == 0 && choice == 2)) {
				System.out.println(". The computer wins.");
				compWins++; 
				
			}
			else 
			{
				System.out.println(". You win!"); 
				userWins++; 
			}
				
			
			
		}
		System.out.println("Final score: " + "\nComputer wins: " + compWins + "\nYour wins: " + 
				userWins + "\n" + ((int)(userWins) > (int)(compWins) ? "You won the tournament!" : 
					"You lost the tournament."));
	}
	
}

