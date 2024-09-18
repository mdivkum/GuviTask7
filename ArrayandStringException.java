package task7.GuviTask7;

public class ArrayandStringException {

	public static void main(String[] args) {
		 int a[] = { 1, 2, 3, 4, 5 };
		 String s="Good";
		 try {
	        
			 String substring = s.substring(7, 1);
			 for (int i = 0; i <=a.length; i++)
	         System.out.println(a[i]);
	  }catch(ArrayIndexOutOfBoundsException e)  
	   {  
	   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
	   }catch(StringIndexOutOfBoundsException d)
	   {
	   System.err.println("String index is out of bounds: " + d.getMessage());  
	      }
	}

}
