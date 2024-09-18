package task7.GuviTask7;

import java.util.Scanner;

public class ExceptionCustom {
	
	public static void validateage(int age) throws InvalidAgeException
	{
		
	
		if(age<18) {
			
		throw new InvalidAgeException("Below the age of 18");
		
		} else {
			
			System.out.println("Above the age of 18");
		}
		
	}
	
	public static void main(String[] args) {
	
		
	try {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age ");
		int age=sc.nextInt();
		validateage(age);
	
	}	catch(InvalidAgeException e) {
		

		   System.out.println("Caught the exception");
		   System.out.println("Exception occured : "+ e.getMessage());
		
	}
		
		

	}

}
