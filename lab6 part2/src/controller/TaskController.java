/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import model.Task;
import view.View;

/**
 *
 * @author wangy
 */
public class TaskController {
        

        View view = new View();
        

    public TaskController(View view, ObservableList<Task> tasklist) {
        
        Button addButton = new Button("ADD");
      
        this.view = view;
       
        view.table.setItems(tasklist);
        view.newTask.getChildren().add(addButton);
        
        tasklist.forEach((Task t) -> {
            
            EventHandler<ActionEvent> deletetask = (ActionEvent e) -> {
                 view.table.getItems().remove(t);
                 }; 
             t.getDeleteButton().setOnAction(deletetask);
             }); 
            
            EventHandler<ActionEvent> addtask;
                addtask = (ActionEvent e) -> {
                    
                Task newTask = new Task(view.new_task_name.getText(),Integer.valueOf(view.new_number.getText()),(String) view.new_status.getValue());
                if(view.new_task_name.getText().isEmpty()) return;
                if(view.new_status.getValue()==null) return;
                if(view.new_number.getText().isEmpty()) return;
                
                view.table.getItems().add(newTask);
                
                EventHandler<ActionEvent> deletetask = (ActionEvent e1) -> {
                    view.table.getItems().remove(newTask);
                };
                newTask.getDeleteButton().setOnAction(deletetask);
            };
         
         
        addButton.setOnAction(addtask);
        }} 
       
 
        

