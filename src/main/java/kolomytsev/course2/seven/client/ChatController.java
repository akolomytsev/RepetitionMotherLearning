package kolomytsev.course2.seven.client;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable {

    private static final int PORT = 8189;
    public TextField input;// текст в малом окне окне
    public ListView<String> listView; // текст в большом окне
    private DataInputStream in;
    private DataOutputStream out;

    @FXML
    protected void sendMessage(ActionEvent actionEvent) throws IOException {
        out.writeUTF(input.getText());

        //String message = input.getText();
        //listView.getItems().add(input.getText());

        out.flush();
        input.clear();
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
                            Platform.runLater(()->{
                                listView.getItems().add(message);
                            });

                            //out.flush();
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
