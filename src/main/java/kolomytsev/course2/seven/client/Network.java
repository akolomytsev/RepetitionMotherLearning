package kolomytsev.course2.seven.client;

import javafx.application.Platform;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Network {
    private Socket socket;
    private static final int PORT = 8189; // делаем так, надо переделать на хост и порт
    private DataInputStream in; // переменная для хранения входящих данных
    private DataOutputStream out; // переменная для хранения исходящих данных
    private static Network instance;

    public static Network getInstance() {
        if(instance == null){
            instance = new Network();
        }
        return instance;
    }

    private Network() {
        try { // для отлавливания проблем с соединением с сервером
            socket = new Socket("localhost", PORT); // подключаемся к серверу
            out = new DataOutputStream(socket.getOutputStream()); // поднимаем исходяший стрим
            in = new DataInputStream(socket.getInputStream());// поднимаем входящий стрим (публичное сообщение)
        } catch (Exception e) {
            System.err.println("Problem with server on port: 8189");
        }
    }

    public void writeMessage(String message) throws IOException {
        out.writeUTF(message);
        out.flush();
    }

    public String readMessage() throws IOException {
        return in.readUTF();
    }

    public void close() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}
