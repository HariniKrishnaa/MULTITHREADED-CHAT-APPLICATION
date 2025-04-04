import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is running... Waiting for a client to connect.");

            try (Socket socket = serverSocket.accept();
                 BufferedReader clientInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter serverOutput = new PrintWriter(socket.getOutputStream(), true);
                 BufferedReader serverInput = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Client connected!");

                String clientMessage, serverMessage;
                while (true) {
                    if ((clientMessage = clientInput.readLine()) != null) {
                        System.out.println("Client: " + clientMessage);
                    }

                    System.out.print("Server: ");
                    serverMessage = serverInput.readLine();
                    serverOutput.println(serverMessage);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}