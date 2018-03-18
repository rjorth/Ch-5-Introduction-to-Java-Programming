import java.util.Scanner; 

public class TopTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: "); 
		int numStudents = input.nextInt(); 
		
		int score, 
			gold = 0,
			silver = 0;
		
		String name = "",
				goldName = "",
				silverName = ""; 
		
		System.out.println("Enter each students' name and score: "); 
			
		for (int i = 0; i < numStudents; i++) {
			System.out.print(
					"Student: " + (i + 1) +
					"\nName: ");
			name = input.next(); 
			System.out.println("Score: ");
			score = input.nextInt();
			
			if (i == 0) {
				gold = score;
				goldName = name; 
			}
			else if (i == 1 && score > gold) {
				silver = gold; 
				gold = score;
				silverName = goldName; 
				goldName = name; 
			}
			else if (i == 1) {
				silver = score;
				silverName = name; 
			}
			else if (i > 1 && score > gold && score > silver) {
				silver = gold; 
				silverName = goldName; 
				gold = score;
				goldName = name;
			}
			else if ( i > 1 && score > silver) {
				silverName = name; 
				silver = score;
				
			}
		}
		System.out.println(
				"Highest scoring student: " + goldName + "\nSecond Highest Scoring Student: " +
						silverName); 
		
		
		

	}

}
