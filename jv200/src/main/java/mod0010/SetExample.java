package mod0010;

import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("second");			//duplicate, nod added
		set.add(new Integer(4));	//duplicate, nod added
		System.out.println(set);
	}
}

// second, new Integer(4) µÎ °³ÀÇ HashSet equals method 
// override