package task7.GuviTask7;

import java.util.Scanner;

public class Exceptions {

	public Exceptions(String str) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the a and b value");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
				
			}catch(ArithmeticException e) {
				
				System.out.println("Arithmetic Error" +e.getMessage());

	}

	}
	}
