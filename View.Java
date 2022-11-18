package com.company;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Bomba extends Casella{
    public Bomba(String s){
        super(s);
        rect=new Rectangle(50,50, Color.BLUE);
        rect.setStroke(Color.BLACK);
    }
    @Override
    public void scopri() {
        sp.getChildren().remove(rect2);
        disabled=true;
        int k= GridPane.getRowIndex(sp);
        int j= GridPane.getColumnIndex(sp);
        for(int i=0; i<10; i++){
            if(!Controller.caselle.get(k*10+i).disabled){
                Controller.caselle.get(k*10+i).scopri();
                ++View.tentativi;
            }
        }
        for(int i=0; i<10; i++){
            if(!Controller.caselle.get(j+i*10).disabled){
                Controller.caselle.get(j+i*10).scopri();
                ++View.tentativi;
            }
        }
        View.tries.setText("TENTATIVI :"+ --View.tentativi);
        GameOver(View.tentativi);
    }
}
