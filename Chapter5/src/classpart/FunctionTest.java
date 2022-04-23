package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int sum = addnum(num1, num2);
		System.out.println(sum);
	}

	public static int addnum(int n1, int n2) { // 함수선언 
		int result = n1 + n2;
		return result; // 수행결과를 반환하기위한 예약어 
	}
}
