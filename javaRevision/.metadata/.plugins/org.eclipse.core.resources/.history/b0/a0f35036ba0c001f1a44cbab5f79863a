package bankSystem;

import java.io.FileNotFoundException;

public class TestError {
	public static void main(String[] args) {
		try {
			int result = 0 / 0;
			openFile();
		} catch (ArithmeticException exception) {
			System.out.println("Erro: " + exception);
		} catch (FileNotFoundException excetion) {
			System.out.println(excetion);
		}
	}

	public static void openFile() throws FileNotFoundException {
		new java.io.FileInputStream("arq.txt");
	}
}