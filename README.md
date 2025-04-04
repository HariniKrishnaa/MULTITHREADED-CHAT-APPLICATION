# MULTITHREADED-CHAT-APPLICATION

COMPANY NAME : CODTECH IT SOLUTIONS

NAME : HARINIKRISHNA

INTERN ID :CT04WU169

DOMAIN NAME : JAVA PROGRAMMING

DURATION : 4 WEEKS

MENTOR : NEELA SANTHOSH KUMAR

DESCRIPTION : This project involves the development of a client-server chat application using core Java concepts, specifically Java Sockets and multithreading. The main objective of this project is to allow multiple users (clients) to communicate with each other in real-time via a centralized server. This is accomplished by creating a multi-threaded server that can handle multiple client connections simultaneously, each managed through individual threads.

In the digital communication world, client-server architecture plays a fundamental role. This project simulates that architecture by establishing a socket-based connection between a server and various clients. The server acts as the communication hub, and clients connect to the server to send and receive messages.

The application was developed using VS Code as the IDE, and the Java Development Kit (JDK) was used to compile and run the application. The server side of the application uses ServerSocket to listen for incoming client requests. Each time a client connects, a new thread is spawned to manage communication with that specific client, ensuring that the server remains responsive to additional connection requests from other clients.

On the client side, each user connects to the server using Socket. Once connected, the client can send messages, which are then broadcasted by the server to all other connected clients. The use of multithreading ensures that each client operates independently, allowing messages to be received and sent simultaneously without interrupting other users’ activity. This asynchronous communication model is a crucial aspect of real-time chat systems.

Key classes and methods used in this project include:

ServerSocket and Socket for establishing the network connections.

BufferedReader, InputStreamReader, PrintWriter, and OutputStreamWriter for handling input and output streams between server and client.

Thread class to enable multithreading and manage client sessions independently.

Collections.synchronizedList() or concurrent data structures to manage multiple client streams safely.


One of the challenges addressed in the project was managing concurrency. Proper synchronization was implemented to prevent race conditions when broadcasting messages to all connected clients. Additionally, error handling was included to manage scenarios like client disconnection, invalid input, or server shutdown.

This project serves as a practical implementation of networking concepts in Java and introduces the importance of concurrency in real-time applications. It closely simulates the backend working of popular chat applications like WhatsApp or Messenger (on a basic level), providing a strong foundation for more advanced features like private messaging, chat history, or GUI-based chat interfaces.

Applications of This Project: This type of client-server architecture is widely used in various fields such as:

Real-time chat platforms

Multiplayer gaming servers

Customer service systems (live chatbots)

Online collaboration tools (like Google Docs or Slack)
