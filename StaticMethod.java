import java.util.Scanner;

public class StaticMethod{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		
		StaticMethod.sum();
		StaticMethod.divide(90,70);
		System.out.println(StaticMethod.product());
		
		System.out.print("Enter full name: ");
		String name = scan.nextLine();
		
		System.out.print(StaticMethod.personName(name));
	}
    public static void sum(){
		int x = 50;
		int y = 30;
		int total = x+y;
		System.out.printf("Sum of the two number is %d%n",total);
	}	
	public static void divide(int x,int y){
		double total = (double)x/y;
		System.out.printf("The second Sum of the two number is %f%n",total);
	}
	
	public static int product(){
		int x = 60;
		int y = 10;
		int total;
		return total = x*y;
	}
	public static String personName(String fullName){
		return fullName;
	}
}