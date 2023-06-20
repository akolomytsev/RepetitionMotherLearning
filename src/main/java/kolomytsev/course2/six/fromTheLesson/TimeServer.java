package kolomytsev.course2.six.fromTheLesson;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TimeServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8189);
        Socket socket = serverSocket.accept();
        System.out.println("Connected");
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        byte[] buffer = new byte[256];
        while (true){
            int read = inputStream.read(buffer);
//            for (int i = 0; i < read; i++) {
//                System.out.println(buffer[i] + ", ");
//            }
            String massage = new String(buffer,0, read);
            System.out.println(massage);
            }

        }
    }