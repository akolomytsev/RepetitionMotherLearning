package kolomytsev.course2.six.sInterneta;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Server implements Runnable{
    private ServerSocket serverSocket;
    public final static int port = 5555;
    private static Map<String, String> clientInfo = new LinkedHashMap<>();
    private static List<Client> clientList = new ArrayList<>();

    public Server() {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server created.\r\n\tPort: " + port + "\r\n\tInetAdress: " + serverSocket.getInetAddress());
        } catch (IOException e) {
            System.err.println("IOException in server`s constructor");
        }
    }

    @Override
    public void run() {
        try {
            while(true) {
                Client client = new Client(serverSocket.accept());
                Thread clientThread = new Thread(client);
                clientList.add(client);
                clientThread.setDaemon(true); // Теперь этот поток будет завершаться при закрытии главного окна
                clientThread.start();
            }
        } catch(IOException e) {
            System.err.println("IOException in Server.run()");
        }
    }

    public final static void addClient(String login, String parol) {
        clientInfo.put(login, parol);
    }

    public final static boolean isPresent(String login, String parol) {
        return clientInfo.get(login) != null && (clientInfo.get(login)).equals(parol);
    }
}
