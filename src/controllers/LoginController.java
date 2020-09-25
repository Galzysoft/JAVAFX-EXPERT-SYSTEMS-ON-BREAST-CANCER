/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDecorator;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextArea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EBUKA
 */
public class LoginController implements Initializable {
       Connection con=null; Statement stmt=null;String user,pass11;int c=0;String faceai_xml="a",imagepath="a";String filew;
  

private double xoffset=0;
    private double yoffset=0;
   @FXML
    private JFXButton minimize;

    @FXML
    private JFXPasswordField retype;

    @FXML
    private JFXRadioButton female2;
  @FXML
    private JFXTabPane tabbbbbb;
    @FXML
    private JFXTextArea address2;

    @FXML
    private JFXTextField phone2;

    @FXML
    private JFXRadioButton male2;

    @FXML
    private ToggleGroup gender2;

    @FXML
    private Label sel2;
    String gendera;
    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton minimize1;

    @FXML
    private JFXPasswordField password1;

    @FXML
    private JFXTextField username1;

    @FXML
    private JFXTextField name2;

    @FXML
    private JFXComboBox<String> userr;

    @FXML
    private JFXTextField age2;

    @FXML
    private JFXTextField username;
String u="aa";String p="aa";
String userrr;



   @FXML
     private void signin(ActionEvent event)
             
    { 
       if(!(password1.getText().length()==0||retype.getText().length()==0||username1.getText().length()==0||name2.getText().length()==0||phone2.getText().length()==0||age2.getText().isEmpty()||address2.getText().length()==0||userr.getValue().length()==0)){ 
        if(password1.getText().equalsIgnoreCase(retype.getText())){
                    
 if("Admin".equals(my_user())){  Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Ilegal Acess");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText("you cant have two Admin");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();}
 else if(co==0){
        String sql="INSERT INTO login1 (username,password,user,name,phone,age,address,gender,date) VALUES (?,?,?,?,?,?,?,?,?) ";
       Calendar timer=Calendar.getInstance();
				 timer.getTime();
				 SimpleDateFormat tTime=	new SimpleDateFormat("HH:mm:ss");
				 tTime.format( timer.getTime());
				 SimpleDateFormat tDate=new SimpleDateFormat("yyyy");
				 tDate.format(timer.getTime());
				String datea =( tDate.format(timer.getTime()));
				String time =( tTime.format(timer.getTime()));
                String c=time+"_"+datea;
          try { 
        PreparedStatement pst=con.prepareStatement(sql);
         pst.setString(1, username1.getText());
          pst.setString(2, password1.getText());
             pst.setString(3, userr.getSelectionModel().getSelectedItem());
  
          
           pst.setString(4, name2.getText());
          pst.setString(5, phone2.getText());
          pst.setString(6, age2.getText());
    
         pst.setString(7, address2.getText());
    pst.setString(8, gendera);
 pst.setString(9, c);
 
          pst.executeUpdate();
        
                Alert loginerror1 = new Alert(Alert.AlertType.INFORMATION);
                loginerror1.setTitle("SignIn sucessfull");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText("you just sucessfully signed up");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
      
    } catch (SQLException ex) {
   
                Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Signup Error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText( "unable to sign up"+ex.getMessage());
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
             }} 
 
 else{
        String sql="INSERT INTO login1 (username,password,user,name,phone,age,address,gender,date) VALUES (?,?,?,?,?,?,?,?,?) ";
       Calendar timer=Calendar.getInstance();
				 timer.getTime();
				 SimpleDateFormat tTime=	new SimpleDateFormat("HH:mm:ss");
				 tTime.format( timer.getTime());
				 SimpleDateFormat tDate=new SimpleDateFormat("yyyy");
				 tDate.format(timer.getTime());
				String datea =( tDate.format(timer.getTime()));
				String time =( tTime.format(timer.getTime()));
                String c=time+"_"+datea;
          try { 
        PreparedStatement pst=con.prepareStatement(sql);
         pst.setString(1, username1.getText());
          pst.setString(2, password1.getText());
             pst.setString(3, userr.getSelectionModel().getSelectedItem());
  
          
           pst.setString(4, name2.getText());
          pst.setString(5, phone2.getText());
          pst.setString(6, age2.getText());
    
         pst.setString(7, address2.getText());
    pst.setString(8, gendera);
 pst.setString(9, c);
 
          pst.executeUpdate();
        
                Alert loginerror1 = new Alert(Alert.AlertType.INFORMATION);
                loginerror1.setTitle("SignIn sucessfull");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText("you just sucessfully signed up");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
      
    } catch (SQLException ex) {
   
                Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Signup Error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText( "unable to sign up"+ex.getMessage());
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
             }} 
        }else{  
                  Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Mismatched password error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText("Please use the same password in the password fields");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();}}
       else{  
                  Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("empty fieds");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText("Some fields are empty");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();}
    }
     @FXML
    private void signup( ActionEvent event)     {
   tabbbbbb.getSelectionModel().select(1);
       
         }
   @FXML
    private void signinn( ActionEvent event)     {
    tabbbbbb.getSelectionModel().select(0);
  
    }             
  @FXML
     private void genoo(ActionEvent event)  {
   
    if (male2 .isSelected()) {gendera="MALE"; System.out.println(gendera);}
    else if (female2 .isSelected()) {gendera="FEMALE"; System.out.println(gendera);}}


    @FXML
    void login(ActionEvent event) throws IOException {
           try {
        stmt = con.createStatement();
             System.out.println("1");
        String sql="SELECT username,password FROM login1 where username='"+username.getText()+"' AND password='"+password.getText()+"' ";
        ResultSet rst=stmt.executeQuery(sql);
         System.out.println("2");
        while(rst.next()){
            
             System.out.println("3");
            user=rst.getString(1);
             System.out.println("");
            pass11=rst.getString(2);
            
            
            
            System.out.println( "userr"+user);
            System.out.println( "passss"+pass11);
        }
        
        if (username.getText().equalsIgnoreCase(user)&&password.getText().equalsIgnoreCase(pass11))
            
            
            
            
            
            
        {    Stage stage1 = (Stage) username.getScene().getWindow();

                Stage stage;
                Parent root  ;   
                  FXMLLoader loader=new FXMLLoader(getClass().getResource("/fxmls/Dash.fxml"));
             
              root =  loader.load();
                
                
        DashController dash = (DashController)loader.getController();
               dash.my_user(logged_user(),username.getText(),password.getText());
 
       
        stage=new Stage();
    
     stage .setMinWidth(1050);stage .setMinHeight(649);
                        stage.setTitle("Breast Cancer");
                     JFXDecorator decorator =new JFXDecorator(stage, root);
decorator.setCustomMaximize(true);

//decorator.setMinWidth(989);
//decorator.setMinHeight(1007);
// root.getStylesheets().add(BIZ_APP.class.getResource("mainoo.css").toExternalForm());

           
Scene  scene = new Scene(decorator, 1050, 649);  
     
//    ?nnnnnnnnnnnnnnnnnnnnnnnnnnn
        
        
        
        stage.setScene(scene);
            stage1.close();
        stage.show();
              
  
        
        
        }else{     
            Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
        loginerror1.setTitle("login error");
        loginerror1.setHeaderText(null);
        loginerror1.setContentText( "wrong username and password");
        loginerror1.initModality(Modality.APPLICATION_MODAL);
        loginerror1.showAndWait();
        }
    } catch (SQLException ex) {     
       Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("login error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText( "errorbro  zz"+ex.getMessage());
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
                System.out.println( "errorbro  "+ex.getMessage());
    }
        
        
        
        
        
        
               
                    //scene.getStylesheets().add(STUDENT_PROJECT_MANAGEMENTSYS.class.getResource("sign_up.css").toExternalForm());
                    
                    
                   // btn.getScene().getWindow().hide();
                

                   
             //   }else{
                    
               // }
            /*
                JFXSnackbar bar=new JFXSnackbar(motherpane);
                
                bar.show("Welcome To Galzy Students Project Management System", 3000);
                Alert loginerror = new Alert(Alert.AlertType.CONFIRMATION);
                loginerror.setTitle("SignIn Sucessfull");
                loginerror.setHeaderText(null);
                
                loginerror.setContentText("welcome");
                loginerror.initModality(Modality.APPLICATION_MODAL);
                loginerror.showAndWait();*/
                
            
}
      @FXML
     private void minimize(ActionEvent event){
          if (event.getSource()==minimize) {
            ((Stage)  username.getScene().getWindow()).setIconified(true);
          }}
      @FXML
     private void minimize11(ActionEvent event){
          if (event.getSource()==minimize1) {
            ((Stage)  username.getScene().getWindow()).setIconified(true);
          }}
         @FXML
     private void exit(ActionEvent event){
           System.exit(0);}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         userr.getItems().addAll("User", "Admin");  
   
      DB_manager db=new  DB_manager();
            try {
                con= db.connect();
                db.create_tables();
                System.out.println("connected");
            } catch (ClassNotFoundException ex) {
                System.out.println("table not connected");}
       
    }    
       String userrrs;
   private String my_user(){
  try {
         
        stmt = con.createStatement();
        String admin="Admin";
             System.out.println("1");
        String sql="SELECT user FROM login1 where user='"+userr.getSelectionModel().getSelectedItem()+"'";
        ResultSet rst=stmt.executeQuery(sql);
         System.out.println("2");
        while(rst.next()){
            co=1;
             System.out.println("3");
              userrrs=rst.getString("user");
              
            
            System.out.println( "userr####"+userrr);
            
        }
     }catch(SQLException e){
     
     
     }
           return userrrs;
   
   
   
   
   
   }
   int co=0;
    
   private String logged_user(){
     try {
         String admin="Admin";
        stmt = con.createStatement();
             System.out.println("1");
        String sql="SELECT user FROM login1 where username='"+username.getText()+"' AND password='"+password.getText()+"' ";
        ResultSet rst=stmt.executeQuery(sql);
         System.out.println("2");
        while(rst.next()){
            
             System.out.println("3");
            userrr=rst.getString("user");
              
            
            System.out.println( "userr"+userrr);
            
        }
     }catch(SQLException e){
     
     
     }
           return userrr;
   
   
   
   
   
   }
    
    
}
