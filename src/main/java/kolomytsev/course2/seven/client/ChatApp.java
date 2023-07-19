package kolomytsev.course2.seven.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kolomytsev.course2.four.Online.src.main.java.com.example.online.ChatApplication;

public class ChatApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(ChatApplication.class.getResource("chat2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 540);
        stage.setTitle("Мини-Чат");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
