package serialization;

import java.io.*;

public class Serializator {
	public static void main(String[] args) {
		if(!validateArgs(args)) {
			return;
		}
		
		String employeeName = args[0];
		float employeeSalary = Float.parseFloat(args[1]);
		Employee employee = new Employee(employeeName, employeeSalary);
		writeObject(employee);
		System.out.println("Employee info saved");
		long serialVersionID = ObjectStreamClass.lookup(employee.getClass()).getSerialVersionUID();
		System.out.println("Serial Version ID: " + serialVersionID);
	}

	private static boolean validateArgs(String[] args) {
		if(args.length == 0) {
			return false;
		}
		try {
			Float.parseFloat(args[1]);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	private static void writeObject(Employee object) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employeeInfo.ser"))) {
			out.writeObject(object);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}