import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
        public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 6999);
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			Scanner keyboard = new Scanner(System.in);
			String line = "";
			while((line = keyboard.nextLine()) != null) {
				out.println(line);
			}
			socket.close();
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
        }
}
