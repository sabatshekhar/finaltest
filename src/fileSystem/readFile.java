package fileSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
public static void main(String[] args){
	String s="D:/file1.txt";
	BufferedReader bf=null;
	
	
	try {
		bf=new BufferedReader(new FileReader(s));
		String s1="";
		while((s1=bf.readLine())!=null)
			System.out.println(s1);
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("file is not there");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
