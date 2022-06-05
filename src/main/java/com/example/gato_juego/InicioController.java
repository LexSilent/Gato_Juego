package com.example.gato_juego;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;


import java.io.IOException;

public class InicioController {
    HelloApplication principal;
    public void btnUnJugador() throws IOException {
       abrirPantalla("Pantalla1Jugador.fxml","Un Jugador",InicioController.class);

    }
    public void btDosJugadores() throws IOException {
        abrirPantalla("Pantalla2Jugadores.fxml","Dos Jugadores",InicioController.class);
    }
    public void btnSalir() {
        Platform.exit();
    }
    public void abrirPantalla(String Pantalla, String titulo,Class clase) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(clase.getResource(Pantalla));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        HelloApplication.stage.setTitle(titulo);
        HelloApplication.stage.setScene(scene);
    }
}
