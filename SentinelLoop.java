import java.util.Scanner;


public class SentinelLoop{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numbers to sum (enter -1 to stop):");
		
		int sum = 0;
		int number;
		
		//Sentinel value is -1
		while(true) {
			System.out.println("Enter number: ");
			number= input.nextInt();
			
			if (number == -1){
				break;
			}
			
			sum += number;	
		}
		
		System.out.printf("the total sum is: %d", sum);
	}
}
			







	



