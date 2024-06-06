package apis;

import java.io.*;
import java.util.*;

public class Output {
	public static void main(String[] args) {
		writeInFile("text.txt");
	}
	
	public static void writeInFile(String fileName) {
		Scanner keyboard = new Scanner(System.in);
		try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true))) {
			do {
				fileWriter.write(keyboard.nextLine());
				fileWriter.newLine();
			} while (keyboard.hasNext());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}