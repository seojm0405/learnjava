package binary;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num; // 덧셈 항의 num이 f로 형변환 후 dNum으로 형변환하며 마무리 
		System.out.println(dNum);
	}

}
