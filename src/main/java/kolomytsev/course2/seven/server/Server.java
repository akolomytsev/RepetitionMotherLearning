package kolomytsev.course2.seven.server;

import kolomytsev.course2.six.sInterneta.Client;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Server {
    private static final int DEFAULT_PORT = 8189;
    private final ConcurrentLinkedQueue<ClientHandler> clients;

    public Server(int port) {
        clients = new ConcurrentLinkedQueue<>();
        try(ServerSocket server = new ServerSocket(port);) {
            System.err.println("[DEBUG] server started on port: " + port) ;
            while (true){
                Socket socket = server.accept();
                System.err.println("[DEBUG] client accepted");
                ClientHandler handler = new ClientHandler(socket, this);
                addClient(handler);
                new Thread(handler).start();
            }
        }catch (Exception e){
            System.err.println("Server was broken");
        }
    }

    public void broadCasteMessage(String msg){
        for (ClientHandler client : clients) {
            client.sendMessage(msg);
            
        }
        
    }

    public void addClient(ClientHandler clientHandler){
        clients.add(clientHandler);
        System.err.println("[DEBUG] client added to broadcast queue");
    }
    public void removeClient(ClientHandler clientHandler){
        clients.remove(clientHandler);
        System.err.println("[DEBUG] client removed to broadcast queue");

    }

    public static void main(String[] args) {
        int port = -1;
        if (args != null && args.length == 1){
            port = Integer.parseInt(args[0]);
        }
        if (port == -1){
            port = DEFAULT_PORT;
        }
        new Server(port);
    }
}
