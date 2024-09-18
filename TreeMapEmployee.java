package task7.GuviTask7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapEmployee {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tree=new TreeMap<>();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the ID and Name");
			int id=sc.nextInt();
			String name=sc.next();
			
			tree.put(id,name);
		}
		
	ArrayList<String> a=new ArrayList<>(tree.values());
	Collections.sort(a);
	System.out.println("Names sorted in ascending order" +a );
		
		
		
		

	}

}
