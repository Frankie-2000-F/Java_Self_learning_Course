import java.util.*;

public class Muster {
	public static void main(String args[]) {
		Collection<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
	}
}
