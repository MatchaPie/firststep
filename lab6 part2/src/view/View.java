/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;

/**
 *
 * @author wangy
 */
public class View extends GridPane{
    String stat[] = { "CLOSED", "IN PROGRESS", "OPEN", "PENDING" }; 
    public TableView table = new TableView();
    public TableColumn NumberCol = new TableColumn("Number");
    public TableColumn TaskNameCol = new TableColumn("Task Name");
    public TableColumn StatusCol = new TableColumn("Status");
    public TableColumn DeleteCol = new TableColumn("Delete");
    public HBox newTask = new HBox();
    
    public TextField new_number = new TextField();
    public TextField new_task_name = new TextField();
    public ComboBox new_status = new ComboBox(FXCollections.observableArrayList(stat));
   
    public View() {
        
        this.setVgap(20);
        this.setAlignment(Pos.CENTER);
        
        newTask.setSpacing(10);
        table.setMaxHeight(250);
        table.setMaxWidth(350);
        
        NumberCol.setCellValueFactory(new PropertyValueFactory<>("number"));
            
        TaskNameCol.setCellValueFactory(new PropertyValueFactory<>("taskname"));
            
        StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        
        DeleteCol.setCellValueFactory(new PropertyValueFactory<>("deleteButton"));
        
        new_number.setMaxWidth(40);
        new_task_name.setMaxWidth(80);
       
            NumberCol.setMinWidth(10);
            TaskNameCol.setMinWidth(50);
            StatusCol.setMinWidth(30);
            DeleteCol.setMinWidth(40);
            
            
            table.getColumns().addAll(NumberCol, TaskNameCol, StatusCol,DeleteCol);
            newTask.getChildren().addAll(new_number,new_task_name,new_status);
             
            
        this.add(table, 1, 1);
        this.add(newTask, 1, 2);
    }
     
    }

   
