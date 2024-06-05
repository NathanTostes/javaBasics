import java.net.*;
import java.io.*;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(6999);
			Socket socket = serverSocket.accept();
			System.out.println("Sucefull!");
			BufferedReader in = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
			String line = "";
			while((line = in.readLine()) != null) {
				System.out.println(line);

			}
			in.close();
			socket.close();
			serverSocket.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
