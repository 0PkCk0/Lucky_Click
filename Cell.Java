package com.company;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import static com.company.Controller.DisattivaGridPane;
import static com.company.View.*;

public class Casella {
    Rectangle rect;
    String punti;
    Rectangle rect2;
    StackPane sp;
    boolean disabled;
    public Casella(String s){
        rect=new Rectangle(50,50,Color.WHITE);
        rect.setStroke(Color.BLACK);
        punti=s;
        rect2=new Rectangle(50,50, Color.YELLOW);
        rect2.setStroke(Color.BLACK);
        disabled=false;
        rect2.setOnMouseClicked(mouseEvent -> scopri());
    }

    public StackPane getSp() {
        sp=new StackPane(rect,new Text(punti),rect2);
        return sp;
    }

    public void scopri(){
        sp.getChildren().remove(rect2);
        disabled=true;
        score.setText("PUNTEGGIO :"+ (punteggio += Integer.parseInt(punti)));
        tries.setText("TENTATIVI :"+ --tentativi);
        System.out.println(tentativi);
        System.out.println(punteggio);
        GameOver(tentativi);
    }

    public void GameOver(int t){
        if(t==0){
            tries.setText("GAME OVER");
            DisattivaGridPane();
        }
    }

    public void Disabilita(){
        rect2.setOnMouseClicked(mouseEvent -> {

        });
    }
}
