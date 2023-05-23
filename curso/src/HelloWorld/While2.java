package HelloWorld;

public class While2 {

	public static void main(String[] args) {
		
		int x = 0;
		
		while(x < 5) {
			int y = x * 3;
			System.out.println("Valor Y " + y);
			x = x + 1;
			System.out.println("Valor X " + x);
		}

		System.out.println("Fim");
	}

}
