package testpkg;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    static void display_list() {
    	Collection <Integer>c = new ArrayList();
    	c.add(5);
    	c.add(6);
    	c.add(7);
    	for(Integer i: c) {
    		System.out.println(i + ", ");
    	}
    } 
}
