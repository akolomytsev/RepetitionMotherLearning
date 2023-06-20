package kolomytsev.course2.six;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import static kolomytsev.course2.six.Utils.handleInThread;

public class EchoServer {
    private volatile boolean running;

    public EchoServer() {
        running = true;
        try (ServerSocket server = new ServerSocket(8189)) {
            Socket socket = server.accept();
            handleSocketInput(socket);
//            handleSystemInput(socket);

            while (running) {
                Thread.onSpinWait();
            }
            socket.shutdownInput();
            socket.close();
            System.out.println("всё");// отпечатываем
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Thread handleSocketInput(Socket socket) throws IOException {
        DataInputStream is = new DataInputStream(socket.getInputStream());
        DataOutputStream os = new DataOutputStream(socket.getOutputStream());

        return handleInThread(() -> {
            while (!Thread.interrupted()) {
                try {
                    String message = is.readUTF();
                    System.out.println("From client " + message);
                    if (message.equals("exit")) {
                        os.writeUTF("Bye Bye!");
                        os.flush();
                        running = false;
                        Thread.currentThread().interrupt();
                    }
                } catch (IOException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
    }

    private Thread handleSystemInput(Socket socket) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DataOutputStream os = new DataOutputStream(socket.getOutputStream());
        return handleInThread(() -> {
            while (!Thread.interrupted()) {
                try {
                    String message = scanner.next();
                    os.writeUTF(message);
                    os.flush();
                    System.out.println("To client: " + message);
                } catch (Throwable e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
    }

    public static void main(String[] args) {
        new EchoServer();
    }
}
