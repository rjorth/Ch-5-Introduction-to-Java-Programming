
public class pyramidPattern {

	public static void main(String[] args) {
		
		int right = 0,
				end = 7;
		
		for (int row = 1; row <= 128; row += row) {
			
			for (int start = 0; start <= end; start++) {
				System.out.print("   "); 
				
				for (int el = 1; el <= row; el += el) {
					System.out.printf("%4d",  (el)); 
				
				}
				for (int r = right; r > 0; r /= 2) {
					System.out.printf("%4d", (r));
				}
				System.out.println(); 
				end--; 
				right = row; 
			}
		}
		

	}

}
