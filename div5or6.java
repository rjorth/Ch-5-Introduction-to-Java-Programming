
public class div5or6 {

	public static void main(String[] args) {
		
		int count = 1; 
		for (int i = 100; i <= 200; i++) {
			
			//^ is an xor
			if (i % 6 == 0 ^ i % 5 == 0) {
				System.out.print((count++ % 10 != 0) ? i + " " : i + "\n"); 
			}
		}

	}

}
