package COLLECTION;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("Saikat");
		ls.add("Sen");
		ls.add("is");
		ls.add("always");
		ls.add("Good");
		ls.add("Boy");
		ls.add(2,"Sen" );
		ls.remove(2);
		
		ls.addFirst("Mr.");
		ls.addLast("wahwah");
		
		for(Object ob : ls) {
			System.out.println(ob);
		}
	}

}//change korlei gay