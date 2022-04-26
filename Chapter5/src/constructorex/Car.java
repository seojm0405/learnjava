package constructorex;

public class Car {
	// 필드 선언
	String carModel;
	String carColor;
	int carNum;
	
	Car(String model, String color, int num){
		carModel = model;
		carColor = color;
		carNum = num;
	}
	
	public Car() {}
	
	public void ShowCarInfo() {
		System.out.println("모델 :"+ carModel + ", 색상 :"+carColor+", 차량번호 :"+carNum);
	}
	
	public static void main(String[] args) {
		Car c3 = new Car("BMW", "blue", 7758);
		// 미리 선언
	}
	
}
