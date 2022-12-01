package ArratList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex4
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
	
	System.out.println("--print all info from arraylist using iterator cursor---");
	Iterator itr = al.iterator();
	while(itr.hasNext())   // true  false
	{
		System.out.println(itr.next());
	}
	
	
	System.out.println("--print all info from arraylist using ListIterator cursor---");
	ListIterator litr = al.listIterator();	
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}

}
}