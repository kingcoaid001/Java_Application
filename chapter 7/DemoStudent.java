class Student{
	int studentID = 101;
	String name = "Coaid";
	int age = 30;
	String gender = "Male";
	
	public void study(){
		System.out.printf("StudentID : %d%n",studentID);
		System.out.printf("Student name : %s%n",name);
		System.out.printf("Student age : %d%n",age);
		System.out.printf("Student gender: %s%n",gender);
		System.out.println("I am sick of java");
	}
			
}

public class DemoStudent{
	public static void main(String args[]){
		Student student = new Student();
		student.study();
		
	}
}