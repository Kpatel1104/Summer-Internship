
import java.util.*;

public class HashSet {
	
	public static void main(String args[])
	{
		
		HashSet<String> hs = new HashSet<String>();

		hs.add("Patel");
		hs.add("Khyati");
		hs.add("S");
		hs.add("Is");
		hs.add("a student");

		
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
