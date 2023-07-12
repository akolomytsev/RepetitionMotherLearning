package kolomytsev.course2.six;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static kolomytsev.course2.six.Utils.handleInThread;

public class EchoClient {
    private volatile boolean running;

    public EchoClient() {
        running = true;
        try (Socket socket = new Socket("localhost", 8189)) {
            handleSocketInThread(socket);
            handleSystemInThread(socket);

            while (running) {
                Thread.onSpinWait();
            }
            socket.shutdownInput();
            socket.close();
            System.out.println("всё");// отпечатываем
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Thread handleSocketInThread(Socket socket) throws IOException {
        DataInputStream is = new DataInputStream(socket.getInputStream());
        return handleInThread(() -> {
            while (!Thread.interrupted()) {
                try {
                    String message = is.readUTF();
                    System.out.println("From server: " + message);
                } catch (IOException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
    }

    private Thread handleSystemInThread(Socket socket) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DataOutputStream os = new DataOutputStream(socket.getOutputStream());
        return handleInThread(() -> {
            while (!Thread.interrupted()) {
                try {
                    String message = scanner.next(); //сканируем что написали на клиенте
                    os.writeUTF(message);//оборачиваем в UTF
                    os.flush();//отправляем в поток
                    System.out.println("To server: " + message);// отпечатываем
                    if (message.equals("exit")) {
                        running = false;
                        Thread.currentThread().interrupt();
                    }
                } catch (IOException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
    }

    public static void main(String[] args) {
        new EchoClient();
    }
}
