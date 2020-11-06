/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 *
 * @author wangy
 */
public class Lab5 extends Application {
    
  
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        GridPane gridingrid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        Scene scene = new Scene(grid, 250, 250);
        primaryStage.setTitle("Buttons Positions");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        gridingrid.setHgap(10);
        gridingrid.setVgap(10);
        
        grid.setVgap(20);
        grid.setHgap(20);
        
        
        HBox hb = new HBox(10);
        Text place = new Text();
        hb.setAlignment(Pos.BOTTOM_RIGHT);
        hb.getChildren().add(place);
        grid.add(hb, 1, 2);
        
          int r = 4;
          int c = 5;
        for(int i = 0,row = 1,col = 1; i< r*c; i++,col++){
        Button btn = new Button("["+row +" ,"+col +"]");
        final String info = "the button you clicked is ["+row +" ,"+col +"]";
        
        gridingrid.add(btn, row, col);
        btn.setOnAction((ActionEvent e) -> {
            place.setFill(Color.BLUE);
            place.setText(info);
            
        });
        if(col >= c){
           col = 0;
           row++;}
        }
        grid.add(gridingrid, 1, 1);
        
       
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
