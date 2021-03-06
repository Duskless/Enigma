/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

import javafx.scene.effect.Glow;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

/**
 *
 * @author eliza
 */
public class Bulb {
    StackPane stack;
    Circle cir;
    Text text;
    String offLightFormat = "-fx-fill: #ffffff; -fx-font-size: 30px;"
            + "-fx-font-weight: bold; ";
    String offCircFormat = "-fx-fill: #000000";
    String onLightFormat = "-fx-fill: #fffa6d; -fx-font-size: 30px; "
            + "-fx-font-weight: bold;";
    String onCircFormat = "-fx-fill: #6a6d72";
    
    public void createLight(String letter){
        cir = new Circle(28);
        cir.setStyle(offCircFormat);
        text = new Text(letter);
        text.setStyle(offLightFormat);
        stack = new StackPane();
        stack.setEffect(GUI.lighting);
        stack.getChildren().addAll(cir,text);
    }
    
    public StackPane getStack(){
        return stack;
    }
    
    public void lightOn(){
        text.setStyle(onLightFormat);
        cir.setStyle(onCircFormat);
        text.setEffect(new Glow(3.0));
        //cir.setEffect(new Glow(1));
    }
    
    public void lightOff(){
        text.setStyle(offLightFormat);
        text.setEffect(null);
        cir.setStyle(offCircFormat);
        cir.setEffect(null);
    }
}