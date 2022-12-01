package ArratList;

import java.util.ArrayList;

public class Ex5
{
	public static void main(String[] args) 
	{
	//	ArrayList al=new ArrayList();          //initial capacity=10
		ArrayList al=new ArrayList(8);     //initial capacity=8
		al.add("Rahul");
		al.add(101);
		al.add('A');
		al.add(65.5f);
		al.add("Rahul");
		al.add(null);
		al.add(null);
		
		System.out.println("--print all data using for loop---");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("--print all data using foreach loop---");
		for(Object s1 :al )
		{
			System.out.println(s1);
		}
		
	}

}
