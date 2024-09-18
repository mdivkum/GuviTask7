package task7.GuviTask7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileNotFound {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			File f=new File("file.txt");
		PrintWriter p=new PrintWriter(new FileWriter(f),true);
		p.println("Hello");
		p.close();
		f.setReadOnly();
		PrintWriter p1=new PrintWriter(new FileWriter("file.txt"),true);
		p1.println("Hello");
		}catch(Exception  e) {
			e.printStackTrace();
			
		}
	}

}
