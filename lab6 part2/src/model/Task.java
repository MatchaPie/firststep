/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.control.Button;

/**
 *
 * @author wangy
 */
public class Task{
    private String taskname;
    private int number;
    private String status;
    private Button deleteButton;

    public Task() {
    }

    public Task(String taskname, int number, String status){
        
        this.taskname = taskname;
        this.number = number;
        this.status = status;
        this.deleteButton = new Button("DELETE");
        
        
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Button getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(Button deleteButton) {
        this.deleteButton = deleteButton;
    }
    
    
}
