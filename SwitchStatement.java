import java.util.Scanner


public class SwitchStatement{
	public static void main(String[] args){
		Scanner san = new Scanner(Syatem.int);
		
		String name;
		int score;
		
		System.out.print("Enter name: ");
		score = scan.nextint();
		
		System.out.print("Enter score: ");
		score = scan.nextint();
		
		
		switch(score/10){
			case 10:
			case 9:
			        System.out.println(name + " your grade is outstanding");
		    break;
			
			case 8:
			case 7:
			case 6:
			        System.out.println(name + " your grade is outstanding");
		    break;
			
			case 5:
			        System.out.println(name + " your grade is Excellent");
		    break;
			
			case 4:
			        System.out.println(name + " your grade is Good");
		    break;
			
			case 4:
			        System.out.println(name + " your grade is Average");
		    break;
			
			case 3:
			case 2:
			case 1:
			case 0:
			        System.out.println(name + " your grade is very Poor");
		    break;

		}
	}
}