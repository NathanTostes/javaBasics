import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
	public static void main(String[] args) {
		try {
			BufferedReader file = new BufferedReader(new FileReader("file.txt"));
			Scanner keyboard = new Scanner(System.in);
			Socket socket = new Socket("localHost", 6999);
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			String line = "";
			while((line = file.readLine()) != null) {
				out.println(line);
			}			
			keyboard.close();
			out.close();
			socket.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}	
}
