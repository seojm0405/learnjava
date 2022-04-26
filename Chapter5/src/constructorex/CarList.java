package constructorex;

public class CarList {

	public static void main(String[] args) {
	
		Car c1 = new Car();
		c1.carModel = "sonata";
		c1.carColor = "black";
		c1.carNum = 8826;
		//  디폴트생성자로 클래스를 호출하여 값입력하기 
		 
		Car c2 = new Car("ganesis", "silver", 1234);
		// 매개변수를 입력하여 값 입력하기 
		
		Car c3 = new Car();
		c3.carModel = "benz";
		c3.carColor = "red";
		c3.carNum = 2545;
		
		c1.ShowCarInfo();
		c2.ShowCarInfo();
		c3.ShowCarInfo();
	}
}
