package loopexample;

public class ForEx2 {

	public static void main(String[] args) {
		
		int cnt = 0;
		for(int i = 100; i > 0; cnt++)
		{
			i -= 10;
			System.out.println(i+""+cnt);
		}
	}

}
