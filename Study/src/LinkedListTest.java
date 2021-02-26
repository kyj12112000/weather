import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	static void printList(LinkedList<String> l) {
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else 
				separator = "\n";
			System.out.println(e + separator);
		}
	}
	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("가영재");
		myList.add("다일재");
		myList.add("나이재");
		myList.add("아삼재");
		
		Collections.sort(myList);
		printList(myList);
		
		Collections.reverse(myList);
		printList(myList);
		
		System.out.println(myList.getFirst());
		System.out.println(myList.getLast());

		
	}

}
