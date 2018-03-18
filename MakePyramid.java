import java.util.Scanner;
public class MakePyramid {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter the number of lines: ");
		int numberOfLines = input.nextInt();

		
		for (int rows = 1; rows <= numberOfLines; rows++) {
			
			for (int space = numberOfLines - rows; space >= 1; space--) {
				System.out.print("  ");
			}
			
			for (int left = rows; left >= 2; left--) {
				System.out.print(left + " ");
			}
			
			for (int r = 1; r <= rows; r++) {
				System.out.print(r + " ");
			}
			
			System.out.println();
		}
	}
}

