package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum); // 실수자료형이 정수자료형으로 넘어오며 소수점 유실 
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; //형변환 순서에 따라 나오는 값이 달라질수 있다 
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
