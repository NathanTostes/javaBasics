import java.net.*;
import java.io.*;

public class Server {
	public static void main (String[] args) {
		try {
			BufferedWriter clientFile = new BufferedWriter(new FileWriter("clientFile.txt"));
			ServerSocket serverSocket = new ServerSocket(6999);
			System.out.println("Waiting for conncection...");
			Socket clientSocket = serverSocket.accept();
			System.out.println("Connected");
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String inputLine = "";
			while((inputLine = in.readLine()) != null) {
				clientFile.write(inputLine);
				clientFile.newLine();
			}
			System.out.println("Client file has saved!");
			in.close();
			clientFile.close();
			clientSocket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
