package kolomytsev.course2.seven.client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import kolomytsev.course2.seven.server.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable {

    private static final int PORT = 8189;
    public TextArea messageField;
    public ListView<String> mainTextArea;
    private DataInputStream in;
    private DataOutputStream out;

    @FXML
    protected void sendMessage() throws IOException {
//        String message = messageField.getText();
//        mainTextArea.getItems().add(message);
//
        out.writeUTF(messageField.getText());
        out.flush();
    }

    @Override //здесь будем делать инициализационные действия
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Socket socket = new Socket("localhost", 8189);
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
            new Thread(()->{
                try {
                        while (true) {
                            String message = in.readUTF();
                            mainTextArea.getItems().add(message);
                        }
                    } catch (IOException e) {
                    System.err.println("Server was broken");

                }
            }).start();
        } catch (Exception e){
            System.err.println("Problem with server on port: 8189");
        }
    }
}
