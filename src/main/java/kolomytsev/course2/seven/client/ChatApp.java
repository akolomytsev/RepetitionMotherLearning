package kolomytsev.course2.seven.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class ChatApp extends Application { // создания вьюхи
    @Override
    public void start(Stage stage) throws Exception {
        Network network = Network.getInstance();
        FXMLLoader fxmlLoader = new FXMLLoader(ChatApp.class.getResource("chat2.fxml")); // название fxml файла откуда тянем параметры создаваемого окна
        Scene scene = new Scene(fxmlLoader.load(), 320, 540); // размер изначално создаваемого окна
        stage.setTitle("Мини-Чат");// название создаваемого окна
        stage.setResizable(false);//
        stage.setScene(scene); //
        stage.show(); // отобразить чат
        stage.setOnCloseRequest(request ->{ //это вызывается когда нажимаем "окно закрыть"
                    try {
                        network.writeMessage("/quit"); // или когда вводят это слово
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

    }

    public static void main(String[] args) {
        launch();
    }
}
