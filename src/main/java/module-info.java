module kolomytsev.course2.four.Online.src.main.java.com.example.online {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens kolomytsev.course2.four.Online.src.main.java.com.example.online to javafx.fxml;
    exports kolomytsev.course2.four.Online.src.main.java.com.example.online;
}

