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
        try { //Запустили  прослушку потока
            out = new DataOutputStream(socket.getOutputStream()); // исходящий поток
            in = new DataInputStream(socket.getInputStream()); // входящий поток
            System.err.println("[DEBUG] client start processing"); // лог
            while (running){ // если поток запущен
                String msg = in.readUTF(); //пишем в поток
                if (msg.equals("/quit")){ //волшебное слово для выхода
                    out.writeUTF(msg); //Читаем из потока  и приобразуем в  UTF формат
                }else {
                    server.broadCasteMessage(msg);// здесь можно добавить ник и отправлять вместе с сообщением
                }
                System.out.println("[DEBUG] message from client " + msg);


            }
        }catch (Exception e){
            System.err.println("Handler connection was broken");
            server.removeClient(this); // отключение клиента
        }

    }

    public void sendMessage (String message) throws IOException { //метод для отправки сообщений всем
//        try {
            out.writeUTF(message); //Записывает строку в базовый выходной поток, используя модифицированную кодировку UTF-8 машинно-независимым способом.
            out.flush(); // Сбрасывает этот поток вывода данных. Это приводит к тому, что все буферизованные выходные байты записываются в поток.
//        }catch (IOException e){
//            System.err.println("Connection was broken while write");
//        }

    }
}
