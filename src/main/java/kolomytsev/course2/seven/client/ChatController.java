package kolomytsev.course2.seven.client;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable { // Initializable для поднятия сети

    private Network network;

    //    private static final int PORT = 8189; // делаем так, надо переделать на хост и порт
    public TextField input;// текст в малом окне окне
    public ListView<String> listView; // текст в большом окне
//    private DataInputStream in; // переменная для хранения входящих данных
//    private DataOutputStream out; // переменная для хранения исходящих данных

    @FXML
    protected void sendMessage(ActionEvent actionEvent) throws IOException {
        network.writeMessage(input.getText());
        //out.writeUTF(input.getText()); //берем исходящее сообщение и отправляем его всем
        //out.flush(); //
        input.clear(); // чистим TextField input
    }


    @Override //здесь будем делать инициализационные действия
    public void initialize(URL url, ResourceBundle resourceBundle) {
        network = Network.getInstance();
        //try { // для отлавливания проблем с соединением с сервером
//            Socket socket = new Socket("localhost", PORT); // подключаемся к серверу
//            out = new DataOutputStream(socket.getOutputStream()); // поднимаем исходяший стрим
//            in = new DataInputStream(socket.getInputStream());// поднимаем входящий стрим (публичное сообщение)
        new Thread(() -> { // Поднимаем новы поток
            try { // и обрабатывая ошибки при разрыве соединения
                while (true) { // в бесконечном цикле
                    String message = network.readMessage();//in.readUTF(); // переводим сообщение в формат UTF
                    if (message.equals("/quit")) {
                        network.close(); // рвем сеть
                        break;
                    }
                    Platform.runLater(() -> { // здесь можно менять listView из fxml и он не будет сыпать исключения
                        listView.getItems().add(message); // добавляем сообщение в лист в своем потоке
                    });
                }
            } catch (IOException e) {
                System.err.println("Server was broken");
//                Platform.runLater(() -> { // здесь можно менять listView из fxml и он не будет сыпать исключения
//                    listView.getItems().add("Server was broken"); // добавляем сообщение в лист в своем потоке
//                });

            }
        }).start();
//        } catch (Exception e) {
//            System.err.println("Problem with server on port: 8189");
//        }
    }
}
