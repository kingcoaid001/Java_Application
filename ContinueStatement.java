public class ContinueStatement{
	public static void main(String[] args){
		
		int i = 0;
	    while(i <= 10){
			
			i++;
			if (i == 5)
				continue;
			System.out.printf("%d%n",i);
		}
		System.out.println("this is the end of loop, dont expect much");
	}
}