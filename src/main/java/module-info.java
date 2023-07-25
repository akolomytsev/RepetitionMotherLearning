module kolomytsev {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens kolomytsev.course2.four.Online.src.main.java.com.example.online to javafx.fxml;
    exports kolomytsev.course2.four.Online.src.main.java.com.example.online;

    opens kolomytsev.course2.seven.client to javafx.fxml;
    exports kolomytsev.course2.seven.client;
}

