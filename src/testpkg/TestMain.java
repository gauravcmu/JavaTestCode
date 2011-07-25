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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CollectionTest.display_list();
	    Collection cute = new ArrayList<String>();	
	    fill(cute);
	    System.out.print(cute.toString());
	}

}
