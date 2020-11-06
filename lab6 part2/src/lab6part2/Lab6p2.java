/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6part2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Task;
import view.View;
import controller.TaskController;

/**
 *
 * @author wangy
 */
public class Lab6p2 extends Application {

    final ObservableList<Task> data = FXCollections.observableArrayList(
            new Task("save world", 1, "Open"),
            new Task("feed unicorn", 2, "In progress"),
            new Task("do homework", 3, "Closed"),
            new Task("sleep", 4, "Pending"),
            new Task("eat", 5, "Open"),
            new Task("drink", 6, "In progress"),
            new Task("have fun", 7, "Pending")
    );

    @Override
    public void start(Stage primaryStage) {
        
        View view = new View();
        TaskController taskcontrol = new TaskController(view, data);
        
        Scene scene = new Scene(view, 400, 400);

        primaryStage.setTitle("Tasks List");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
