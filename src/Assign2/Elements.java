package Assign2;

import java.util.ArrayList;
import java.util.List;

public class Elements {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Idli");
		al.add("vada");
		al.add("sambar");
		al.add("chutney");
		al.add("kesaribath");
		List<String> lst=new ArrayList<>();
		lst.add("vada");
		lst.add("Idli");
		System.out.println(lst.containsAll(al));
		System.out.println(al.containsAll(lst));
	}
}
