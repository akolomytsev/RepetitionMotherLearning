package kolomytsev.course2.seven.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Server { // класс
    private static final int DEFAULT_PORT = 8189;
    private final ConcurrentLinkedQueue<ClientHandler> clients; // это коллекция куда надо записывать клиентов

    public Server(int port) { //публичный конструктор предназначеный для инициализации всех переменных
        clients = new ConcurrentLinkedQueue<>();
        try (ServerSocket server = new ServerSocket(port)) { // подняли серверный сокет в ресурсе try
            System.err.println("[DEBUG] server started on port: " + port);
            while (true) { // пока истинв то слушаем
                Socket socket = server.accept(); //инкапсулирую с клиентом
                System.err.println("[DEBUG] client accepted");
                ClientHandler handler = new ClientHandler(socket, this);
                addClient(handler); //запуск метода добавления клиента в очередь
                new Thread(handler).start();
            }
        } catch (Exception e) {
            System.err.println("Server was broken");
        }
    }

    public void broadCasteMessage(String msg) throws IOException { //метод для рассылки всем клиентам сообщений
        for (ClientHandler client : clients) { //пробегаемся по всем клиентам
            client.sendMessage(msg); // делаем sendMessage
        }

    }

    public void addClient(ClientHandler clientHandler) { //метод для добавления клиента в очередь и логирования этого события
        clients.add(clientHandler);
        System.err.println("[DEBUG] client added to broadcast queue");
    }

    public void removeClient(ClientHandler clientHandler) {
        clients.remove(clientHandler);
        System.err.println("[DEBUG] client removed to broadcast queue");

    }

    public static void main(String[] args) {
        int port = -1;
        if (args != null && args.length == 1) {
            port = Integer.parseInt(args[0]);
        }
        if (port == -1) {
            port = DEFAULT_PORT;
        }
        new Server(port);
    }
}
