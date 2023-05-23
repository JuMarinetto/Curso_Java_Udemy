package HelloWorld;

public class For2 {

	public static void main(String[] args) {

		int x = 8;
		int y = 3;
		
		for (int i = 0; y < x; i++) {
			x = x - 2;
			y = y + 1;
			System.out.println("Valor I " + i);
			System.out.println("Valor X " + x);
			System.out.println("Valor Y " + y);
		}

	}

}
