import java.util.Scanner; 

public class HighestScore {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int highScore = 0; 
		String topStudent = ""; 
		
		System.out.print("Enter the number of students: "); 
		int numStudents = input.nextInt(); 
		
		System.out.println("Enter each student's name and score");
		for (int i = 0; i < numStudents; i++) {
			System.out.print(
					"Student: " + (i + 1) + 
					"\nName: "); 
			String name = input.next(); 
			System.out.print(
					"Score: "); 
			int score = input.nextInt(); 
			
			if (score > highScore) {
				highScore = score; 
				topStudent = name; 
			}
			
		}
		System.out.println("Student with the highest score: " + topStudent); 	
		

	}

}
