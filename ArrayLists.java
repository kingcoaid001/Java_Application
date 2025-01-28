import java.util.ArrayList;

public class ArrayLists{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Kimani");
		list.add("Lolli");
		list.add("Coaid");
		list.add("King");
		list.add("Daniel");
		
		//adding a value to a particular index
		list.add(2,"Danny");
		
		//removing an element with item  name
		list.remove("coaid");
		
		//removing an element with index number
		list.remove("4");
		
		//getting an element 
		 System.out.println(list.get(3));
		 
		 // updating a value using set
		 list.set(3,"chizzy");
		
		for(String name : list){
			System.out.printf("%s%n", name);
		}
		
	}
}
