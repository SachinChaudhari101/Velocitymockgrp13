package ArratList;

import java.util.ArrayList;

public class Ex3 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(8);     //initial capacity=8
		al.add("Rahul");
		al.add(101);
		al.add('A');
		al.add(65.5f);
		al.add("Rahul");
		al.add(null);
		al.add(null);
		
		//add info in between arraylist    --> right shift operation
				System.out.println(al);
				al.add(4, "mahesh");
				System.out.println(al);
				
				//remove info in between arraylist --> left shift operation
				al.remove(4);
				System.out.println(al);
				
				//update/modify info from arraylist
				al.set(1, 102);
				System.out.println(al);
				
		
		
		
	}

}
