package task7.GuviTask7;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
	
		ArrayList<String> student=new ArrayList<>();
		student.add(0,"Jesh");
		student.add(1,"Divya");
		student.add(2,"Santhosh");
		student.add(3,"Arun");
		student.add(4,"Kumar");
		
		int s=student.size();
	
		String[] arr= new String[s];
		student.toArray(arr);
		for(String name:arr) {
			System.out.println(name);
			
		}
}

}
