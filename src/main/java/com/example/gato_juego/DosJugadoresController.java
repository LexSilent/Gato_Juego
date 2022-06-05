package com.example.gato_juego;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DosJugadoresController {
    @FXML Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @FXML Label lblturno,lblganadorAnterior;

    //X es el usuario 1 true
    //O es el usuario 2 o la persona false
    boolean turno=true;
    public void bt1(){
       funcionXO(b1);
    }
    public void bt2(){
        funcionXO(b2);
    }
    public void bt3(){
        funcionXO(b3);
    }
    public void bt4(){
        funcionXO(b4);
    }
    public void bt5(){
        funcionXO(b5);
    }
    public void bt6() {
        funcionXO(b6);
    }
    public void bt7(){
        funcionXO(b7);
    }
    public void bt8(){
        funcionXO(b8);
    }
    public void bt9(){
        funcionXO(b9);
    }

    public void funcionXO(Button b){
        if(turno){
            b.setText("X");
        }else{
            b.setText("O");
        }
        b.setDisable(true);
        lblturno.setText("Sigue jugador "+(turno ? "O" : "X"));
        checarGanador(b.getText());
        System.out.println();
        turno=!turno;

    }

    public void checarGanador(String c){
        if(b1.getText().equals(c)&&b2.getText().equals(c)&&b3.getText().equals(c)){
            reiniciar(c);
        }else if(b4.getText().equals(c)&&b5.getText().equals(c)&&b6.getText().equals(c)){
            reiniciar(c);
        }else if(b7.getText().equals(c)&&b8.getText().equals(c)&&b9.getText().equals(c)){
            reiniciar(c);
        }else if(b1.getText().equals(c)&&b4.getText().equals(c)&&b7.getText().equals(c)){
            reiniciar(c);
        }else if(b2.getText().equals(c)&&b5.getText().equals(c)&&b8.getText().equals(c)){
            reiniciar(c);
        }else if(b3.getText().equals(c)&&b6.getText().equals(c)&&b9.getText().equals(c)){
            reiniciar(c);
        }else if(b1.getText().equals(c)&&b5.getText().equals(c)&&b9.getText().equals(c)){
            reiniciar(c);
        }else if(b3.getText().equals(c)&&b5.getText().equals(c)&&b7.getText().equals(c)){
            reiniciar(c);
        }
        if(b1.isDisable()&&b2.isDisable()&&b3.isDisable()&&b4.isDisable()&&b5.isDisable()&&b6.isDisable()&&b7.isDisable()&&b8.isDisable()&&b9.isDisable()){
            reiniciar("empate");
        }

    }

    public void reiniciar(String c){
        lblturno.setText("El turno es de "+(turno ? "O" : "X"));
        lblganadorAnterior.setText("El ganador anterior es: "+c);

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        b1.setDisable(false);
        b2.setDisable(false);
        b3.setDisable(false);
        b4.setDisable(false);
        b5.setDisable(false);
        b6.setDisable(false);
        b7.setDisable(false);
        b8.setDisable(false);
        b9.setDisable(false);
    }

}