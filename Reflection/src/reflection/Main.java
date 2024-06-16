package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("Nathan", 17, 80);
		Field[] personFields = person.getClass().getDeclaredFields();
		for(Field field : personFields) {
			field.setAccessible(true);
			try {
				System.out.println(field.getName() + ": " + field.get(person));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		Method[] personMethods = person.getClass().getDeclaredMethods();
		for(Method method : personMethods) {
			method.setAccessible(true);
			if(method.getName().equals("walk")) {
				try {
					method.invoke(person);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
			if(method.getName().equals("getAnimalGroup")) {
				try {
					System.out.println(method.invoke(person));
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
}