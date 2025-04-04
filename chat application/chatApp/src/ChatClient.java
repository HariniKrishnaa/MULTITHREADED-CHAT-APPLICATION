import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter clientOutput = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader clientInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to chat server.");

            String clientMessage, serverMessage;
            while (true) {
                System.out.print("You: ");
                clientMessage = clientInput.readLine();
                clientOutput.println(clientMessage);

                if ((serverMessage = serverInput.readLine()) != null) {
                    System.out.println("Server: " + serverMessage);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}