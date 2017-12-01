/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Raul Garay
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StringProperty pStPro = new SimpleStringProperty("String Property");
        StringProperty sStPro = new SimpleStringProperty("1");
        System.out.println(sStPro.get());
        sStPro.bindBidirectional(pStPro);
        pStPro.set("Cambio el primer string");
        System.out.println(sStPro.get());
        sStPro.set("segundo");
        TextArea txtA = new TextArea();
        txtA.setText(pStPro.get());
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        /*btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });*/
        btn.setOnAction((ActionEvent event) -> {
            txtA.setText("hola mundo");
        });
        
        VBox root = new VBox();
        root.getChildren().add(txtA);
        root.getChildren().add(btn);
        root.setStyle("-fx-background:#222;");
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Ejemplo");
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
