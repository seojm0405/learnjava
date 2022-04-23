package loopexample;

public class ForEx {

	public static void main(String[] args) {

		String str;
		
		for(str = ""; str.length() < 5; str += "A");
		System.out.println(str);
	}

}
