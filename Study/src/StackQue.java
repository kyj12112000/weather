import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQue {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		Queue<Integer> qu = new LinkedList<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		qu.offer(11);
		qu.offer(22);
		qu.offer(33);
		qu.offer(44);
		
		
		for(int i = 0; i<st.size(); i++) {
			System.out.println("st "+ i + " : " + st.get(i));
		}
		
		System.out.println("st : "+ st);
		System.out.println("qu : "+ qu);
		System.out.println();
		System.out.println("ST>>>>");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		System.out.println("");
		System.out.println("QU>>>>");
		while(!qu.isEmpty()) {
			System.out.println(qu.poll());
		}
		
		System.out.println(st);
		System.out.println(qu);
		
		
		
		
		
		
		
		
	}

}
