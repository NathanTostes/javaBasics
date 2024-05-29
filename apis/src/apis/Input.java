package apis;

import java.io.*;

public class Input {
	public static void main(String[] args) {
		readFile("text.txt");
	}

	public static void readFile(String fileName) {
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String textLine = reader.readLine();
			do {
				System.out.println(textLine);
				textLine = reader.readLine();
			} while(textLine != null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}