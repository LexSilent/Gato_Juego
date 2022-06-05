module com.example.gato_juego {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gato_juego to javafx.fxml;
    exports com.example.gato_juego;
}