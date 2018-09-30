package fileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class readData {
public static void main(String[] args){
	
	String s="D:/file.txt";
	InputStream in=null;
	File file = new File("Downloads"); 
	System.out.println(file.exists()); 
	
	try {
		in=new FileInputStream(s);
		byte[] bte=new byte[2*1024];
		int readCount=0;
		while((readCount=in.read(bte))>0){
			System.out.println(new String(bte,0,readCount-1));
		}
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
        try{
            if(in != null) in.close();
        } catch(Exception ex){
             
        }
    }
//- See more at: http://www.java2novice.com/java-file-io-operations/read-as-byte-array-from-file/#sthash.baSnYiJC.dpuf
}
}
