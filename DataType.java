public class DataType{
	public static void main(String[]args){
		boolean isAGirl = true;
		char alphabet = 'A';
		char alphabet1 = '?';
		
		//using byte
		byte age = 23;
		
		System.out.println(isAGirl);
		System.out.println(alphabet);
		System.out.println(alphabet1);
		System.out.println(age);
		
		//using shorts
		short quantity = 32000;
		System.out.println(quantity);
		
		//using int
		int population = 2000000000;
		System.out.println(population);
		
		//using long you must append an l or  L for clarity at the end of the number
		long worldPopulation = 3000000000000000L;
		System.out.println(worldPopulation);
		//using float  we add a F suffix to declare it as a float and not a double
		float weight = 456.7F;
		System.out.println(weight);
		//using double we add a D suffix to declare it as a double and not a float
		double myBalance = 2373737.887D;
		System.out.println(myBalance);
		
		//conversion
		double balance = 500000;
		System.out.println(balance);
	}
}