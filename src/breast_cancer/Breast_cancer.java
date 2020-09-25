/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breast_cancer;

import com.jfoenix.controls.JFXDecorator;
import controllers.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author EBUKA
 */
public class Breast_cancer extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
Parent root;
            //if(event.getSource()==btn){
                    stage = new Stage();
                    FXMLLoader loader=new FXMLLoader(getClass().getResource("/fxmls/splash.fxml"));
          LoginController dash = (LoginController)loader.getController();
// dash.vf();
              root =  loader.load();
              
            stage.setScene(new Scene(root));
                   
              
                  stage.initStyle(StageStyle.UNDECORATED);
              stage.centerOnScreen();
              
          
                  
              
              
               
                    stage.centerOnScreen();
                    
                    stage.show();
                
  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
