package kolomytsev.course2.seven.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler implements Runnable{

    private Socket socket;
    private Server server;
    private DataInputStream in;
    private DataOutputStream out;
    private boolean running;

    public ClientHandler(Socket socket, Server server) {
        this.socket = socket;
        this.server = server;
        this.running = true;
    }

    @Override
    public void run() {
        try {
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
            while (running){
                String msg = in.readUTF();
                System.out.println("[DEBUG] message from client " + msg);

            }
        }catch (Exception e){
            System.err.println("Handler connection was broken");
            server.removeClient(this);
        }

    }

    public void sendMessage (String message){
        try {
            out.writeUTF(message);
            out.flush();
        }catch (IOException e){
            System.err.println("Connection was broken while write");
        }

    }
}
