package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;

	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public void showStudentInfor() {
		System.out.println(studentName + ',' + address);
	} 
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이순신");
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student(101, "김유신");
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
/*	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		
		studentLee.showStudentInfor();
		
	}*/
}
