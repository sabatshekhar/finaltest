package fileSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class storeandReadObject {
public  void storevalue(employee e){
	OutputStream out;
	
	try {
		out =new FileOutputStream("D:/file1.txt");
		ObjectOutputStream ob=new ObjectOutputStream(out); 
		ob.writeObject(e);
		ob.flush();
		
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
	public void storeObject(){
		InputStream in=null;
		
		try {
			in=new FileInputStream("D:/file1.txt");
			ObjectInputStream obj=new ObjectInputStream(in);
			employee e1=(employee) obj.readObject();
			System.out.println(e1.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args){
		employee e=new employee("ra","sa",1);
		storeandReadObject c=new storeandReadObject();
		
		c.storevalue(e);
		c.storeObject();
	}
}
class employee implements Serializable{
	String firstName;
	String Lname;
	int id;
	employee(String firstName,String Lname,int id){
		this.firstName=firstName;
		this.Lname=Lname;
		this.id=id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString(){
		return firstName+" " +Lname+" "+id;
	}
}