package task7.GuviTask7;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
	
		ArrayList<String> a=new ArrayList<>();
		
		a.add("Chennai");
		a.add("Delhi");
		a.add("Mumbai");
		a.add("Cochin");
		a.add("Kolkata");
		System.out.println("Cities in india :"+a );
		a.removeAll(a);
		System.out.println("After removing all cities" + a);

		
	}

}
