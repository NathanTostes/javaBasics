package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class Deserializer {
	public static void main(String[] args) {
		Object object = readObject();
		System.out.println(object.toString());
		long serialVersionID = ObjectStreamClass.lookup(object.getClass()).getSerialVersionUID();
		System.out.println("Serial Version ID: " + serialVersionID);
	}
	
	public static Object readObject() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("employeeInfo.ser"));
			return in.readObject();
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}