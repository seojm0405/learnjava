package loopexample;

public class ForExgugudan {

	public static void main(String[] args) {

		for(int dan = 1; dan <= 9; dan++) {
			System.out.println("***"+dan+"단***");
			for(int x = 1; x <= 9; x++) {
				System.out.println(dan+"*"+x+"="+dan*x);
			}
		}
	}

}
