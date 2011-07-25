package testpkg;
import java.util.*;


public class TestMain {

	public static void fill(Collection c)
	{
		c.add("Hello");
		c.add("How");
		c.add("Are");
		c.add("You");		
	}
	public static void print(Collection c)
	{
		System.out.print(c);
	}
	public static void removeAndAdd(LinkedList list1, LinkedList list2 )
	{
		if(list1.isEmpty()) {return;}
		
		Object temp = list1.remove();
		list2.add(0, temp);
	}
	
	public static LinkedList reverseList(LinkedList list1) {
		if(list1.isEmpty()) {return null;}
		
		LinkedList list2 = new LinkedList<Integer>();
		while (!(list1.isEmpty())) {
			removeAndAdd(list1, list2);
		}
		print(list2);
		return (LinkedList) list2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//CollectionTest.display_list();
//	    Collection cute = new ArrayList<String>();	
//	    fill(cute);
//	    System.out.print(cute.toString());
//	    
//	    Collection cuteList = new LinkedList<String>();
//	    cuteList.add("WTF");cuteList.add("IS");cuteList.add("Wrong");cuteList.add("with U");
////	    print(cuteList);
////	    iterateAndPrint(cuteList);
		
		/*Create a linked list*/
		Collection list1 = new LinkedList<Integer>();
		list1.add(1);list1.add(2);list1.add(3);list1.add(4);
		print(list1);
		LinkedList list2 = reverseList((LinkedList)list1);
		/**/
	}
	public static void iterateAndPrint(Collection c) {
		Iterator iter = c.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}	
	}

}
