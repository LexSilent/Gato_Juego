package com.example.gato_juego;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class UnJugadorController {
    @FXML
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @FXML
    Label lblganadorAnterior;
    Minimax minimax=new Minimax();

    //X es el usuario 1 true
    //O es el usuario 2 o la persona false
    boolean turno=true;
    public void bt1(){
        funcionXO(b1,0);
    }
    public void bt2(){
        funcionXO(b2,1);
    }
    public void bt3(){
        funcionXO(b3,2);
    }
    public void bt4(){
        funcionXO(b4,3);
    }
    public void bt5(){
        funcionXO(b5,4);
    }
    public void bt6() {
        funcionXO(b6,5);
    }
    public void bt7(){
        funcionXO(b7,6);
    }
    public void bt8(){
        funcionXO(b8,7);
    }
    public void bt9(){
        funcionXO(b9,8);
    }

    public void funcionXO(Button b,int  coord){

        b.setText("X");
        b.setDisable(true);
        minimax.pulsaBoton(coord);
        ganar();


    }
    public void ganar(){
        int pos= minimax.getUltimoBoton();
        if(pos==0){
            b1.setText("0");
            b1.setDisable(true);
            checarGanador(b1.getText());
        }else if(pos==1){
            b2.setText("0");
            b2.setDisable(true);
            checarGanador(b2.getText());
        }else if(pos==2){
            b3.setText("0");
            b3.setDisable(true);
            checarGanador(b3.getText());
        }else if(pos==3){
            b4.setText("0");
            b4.setDisable(true);
            checarGanador(b4.getText());
        }else if(pos==4){
            b5.setText("0");
            b5.setDisable(true);
            checarGanador(b5.getText());
        }else if(pos==5){
            b6.setText("0");
            b6.setDisable(true);
            checarGanador(b6.getText());
        }else if(pos==6){
            b7.setText("0");
            b7.setDisable(true);
            checarGanador(b7.getText());
        }else if(pos==7){
            b8.setText("0");
            b8.setDisable(true);
            checarGanador(b8.getText());
        }else if(pos==8){
            b9.setText("0");
            b9.setDisable(true);
            checarGanador(b9.getText());
        }
        System.out.println(pos);

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

        lblganadorAnterior.setText("El ganador anterior es: "+c);
        minimax.reiniciar();
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
