package kolomytsev.course2.six.sInterneta;

import java.io.*;
import java.net.Socket;

public class Client implements Runnable{
    private Socket clientSocket;

    public Client(Socket clientSocket) {
        this.clientSocket = clientSocket;
        System.out.println("New client connected.\r\n\tInetAdress: " + clientSocket.getInetAddress());
    }

    @Override
    public void run() {
        try(InputStream in = clientSocket.getInputStream();
            OutputStream out = clientSocket.getOutputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(out))) {

//            stageController sc = new stageController();
//            String string1 = null;
//            String string2 = null;

            while(clientSocket.isConnected()) {
                System.out.println("hello");

                /* По нажатию на кнопку отправлять сообщение серверу */
//                try{
//                    string1 = sc.getMsg(); // Вот тут NPE
//                } catch(NullPointerException e) {continue;}
//                if(!string1.isEmpty() && string1 != null) {
//                    bufferedWriter.write(string1);
//                    System.out.println("Client has send the message");
//                }
                /*****************************************************/

                /* Принимать сообщение от сервера */
//                if((string2 = bufferedReader.readLine()) != null) {
//                    sc.receive(string2 + "\r\n");
//                    System.out.println("Client received the message");
//                }
                /**********************************/
            }
        } catch (IOException e) {
            System.err.println("IOException in Client class!");
        }
    }
}
