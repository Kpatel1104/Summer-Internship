
import java.util.*;
public class stack {
	

	public static void main(String args[])
	{
		Stack<String> stack = new Stack<String>();
		stack.push("Khyati");
		stack.push("s");
		stack.push("Patel");
		stack.push("Patel");

		Iterator<String> itr = stack.iterator();

		
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		stack.pop();

		
		itr = stack.iterator();

		
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
