package kolomytsev.course2.seven.client;

import javafx.application.Platform;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Network { // класс сронящий данные сети
    private Socket socket; //название программного интерфейса для обеспечения обмена данными между процессами.
    // Процессы при таком обмене могут исполняться как на одной ЭВМ, так и на различных ЭВМ, связанных между собой только сетью
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

    public void writeMessage(String message) throws IOException { // метод записи строки в базовый выходной поток, используя модифицированную кодировку UTF-8 машинно-независимым способом.
        out.writeUTF(message);
        out.flush();
    }

    public String readMessage() throws IOException { //метод считывает из потока представление символьной строки Юникода,
        // закодированной в модифицированном формате UTF-8; эта строка символов затем возвращается как строка
        return in.readUTF();
    }

    public void close() throws IOException {// при закрытии сети
        in.close();
        out.close();
        socket.close();
    }
}
