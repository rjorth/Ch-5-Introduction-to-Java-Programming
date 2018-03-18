
public class Div5and6 {

	public static void main(String[] args) {
		int div = 1; 
		for (int i = 100; i <= 1000; i++) {
			
			if (i % 5 == 0 && i  % 6 == 0) {
				System.out.print((div++ % 10 != 0) ? i + " " : i + "\n");
			}
		}

	}

}
