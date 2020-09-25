/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTabPane;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author EBUKA
 */
public class DashController implements Initializable {
    
 private double xoffset=0;
    private double yoffset=0;
   
    String gendera,namea;
     private ObservableList<USERS> datadmin;Connection con=null;Statement stmt=null;
 private ObservableList<USERS1> datauser;

    @FXML
    private Tab tsymptoms;

    @FXML
    private RadioButton mediumchange;

    @FXML
    private JFXCheckBox change1;

    @FXML
    private JFXTextArea textpitting;
String dio;
    @FXML
    private TableView<USERS> type;

    @FXML
    private Tab tchange;

    @FXML
    private RadioButton highchange;

    @FXML
    private ToggleGroup whitegroup111;

    @FXML
    private BarChart<String, Number> bar;

    @FXML
    private CategoryAxis ca1;

    @FXML
    private Tab tdash;

    @FXML
    private JFXCheckBox rash1;

    @FXML
    private ToggleGroup whitegroup111111;

    @FXML
    private Tab tpitting;

    @FXML
    private NumberAxis na11;

    @FXML
    private Tab tpatients1;

    @FXML
    private Label usern1;

    @FXML
    private RadioButton lowdis;

    @FXML
    private RadioButton highpit;

    @FXML
    private TableView<USERS1> type1;
 
    @FXML
    private Tab trash;

    @FXML
    private JFXCheckBox pitting1;

    @FXML
    private NumberAxis na;

    @FXML
    private TableColumn<USERS, String> cdate;

    @FXML
    private GridPane user_dash;

    @FXML
    private Text loggeduser;

    @FXML
    private JFXTextArea textpain;
     @FXML
    private JFXTextArea  viewdiagnosis;
 @FXML
    private JFXTextArea  viewdiagnosis1;

    @FXML
    private RadioButton mediumrash;

    @FXML
    private Label name1;

    @FXML
    private RadioButton highdis;

    @FXML
    private RadioButton mediumpit;

    @FXML
    private RadioButton mediumdis;

    @FXML
    private ImageView passsssss1;

    @FXML
    private TableColumn<USERS, String> cname;

    @FXML
    private ToggleGroup whitegroup1111111;

    @FXML
    private JFXTextArea textrash;

    @FXML
    private JFXCheckBox pain1;

    @FXML
    private RadioButton mediumpain;

    @FXML
    private BarChart<String, Number> bar1;

    @FXML
    private CategoryAxis ca11;

 

    @FXML
    private TextField search;

    @FXML
    private RadioButton lowrash;

    @FXML
    private JFXCheckBox discharge1;

    @FXML
    private RadioButton lowchange;

    @FXML
    private TextField search1;

    @FXML
    private Tab tpain;

    @FXML
    private CategoryAxis ca;

    @FXML
    private TableColumn<USERS1, String> cdate1;

    @FXML
    private NumberAxis na1;

    @FXML
    private RadioButton highpain;

    @FXML
    private BarChart<String, Number> bar11;

    @FXML
    private ToggleGroup whitegroup1111;

    @FXML
    private JFXTextArea textchange;

    @FXML
    private ToggleGroup whitegroup11;

    @FXML
    private AnchorPane swsw1;

    @FXML
    private TabPane tabpaneeeee;
 
    @FXML
    private RadioButton lowpain;

    @FXML
    private RadioButton lowpitting;

    @FXML
    private Tab tpatients11;

    @FXML
    private Label date1;

    @FXML
    private Tab tdischarge;

    @FXML
    private RadioButton highrash;

    @FXML
    private GridPane admin_dash;

    @FXML
    private JFXTextArea textdischarge;


     int position;
      private void cccear()  {
     lowchange.setSelected(false);
           lowdis.setSelected(false);
           lowpain.setSelected(false);
                lowpitting.setSelected(false);
                     lowrash.setSelected(false);
                          mediumchange.setSelected(false);
                               mediumdis.setSelected(false);
                                mediumpain.setSelected(false);
                          mediumpit.setSelected(false);
                               mediumrash.setSelected(false);
                                highchange.setSelected(false);
                               highdis.setSelected(false);
                                highpain.setSelected(false);
                          highpit.setSelected(false);
                               highrash.setSelected(false);
                               
                               textchange.setText(null);
                                     
                               textdischarge.setText(null);
                                     
                               textpain.setText(null);
                                     
                               textpitting.setText(null);
                               
                                     
                               textrash.setText(null);
      }
       @FXML
       private void getchest1(ActionEvent event)  {
               cccear();  tabpaneeeee.getSelectionModel().select(position);
       
       
           // tabpaneeeee.getSelectionModel().select((Tab) tabuu);
 
         }
  
    
    @FXML
     private void painlevel(ActionEvent event)  {
         if (lowpain.isSelected()) {textpain.setText(namea+" You Have Breast cysts\n" +
"Breast cysts Overview\n" +
"\n" +
"Breast cysts can feel like a lump in the breast. They are fluid-filled sacs that can be soft or firm.\n" +
"\n" +
"They may or may not cause pain. These cysts typically enlarge during the menstrual cycle and go away once menopause is reached.\n" +
"\n" +
"Most breast cysts consist of fluid rather than cells. A cyst is different from a tumor, and it is not cancerous.");submit(textpain.getText());}
         else if (mediumpain.isSelected()) {textpain.setText(namea+" You Have Costochondritis\n" +
"Costochondritis\n" +
"\n" +
"Costochondritis, or costosternal syndrome, is an inflammation of the cartilage that connects the ribs and breastbone.\n" +
"\n" +
"It can occur with arthritis. Arthritis in the neck or upper back can also lead to pain or numbness in the chest. It can also occur with an injury or physical strain.\n" +
"\n" +
"Sometimes, there may be swelling.\n" +
"\n" +
"It is not related to the breast, but it causes a burning pain that can be confused with breast pain.\n" +
"\n" +
"This condition most often affects women and people over 40 years of age.");}
         else if (highpain.isSelected()) {textpain.setText(namea+" You Have Fibrocystic breast changes\n" +
"Fibrocystic breast changes:\n" +
"\n" +
"Fibrocystic breast changes can cause one or both breasts to become lumpy, tender, and swollen. This is due to a buildup of fluid-filled cysts and fibrous tissue. There may also be nipple discharge.\n" +
"\n" +
"This harmless condition is not uncommon in women aged between their 20s and 50s. It is not linked to a higher risk of breast cancer.\n" +
"\n" +
"Some changes that might help reduce discomfort include:\n" +
"\n" +
"following a low-salt diet\n" +
"using mild pain-relief medication\n" +
"At least one study has suggested that vitamin E and B6 supplements may help with cyclic mastalgia, and especially fibrocystic changes.\n" +
"\n" +
"However, a systematic review concluded that vitamins make no difference.\n" +
"\n" +
"Caffeine reduction and evening primrose oil are often recommended, but one systematic review has concluded that these are not effective in treating breast pain.");}
    submit(textpain.getText());  refreshtable(); } 
     
     
     @FXML
     private void pitinnglevel(ActionEvent event)  {
         if (lowpitting.isSelected()) {textpitting.setText(namea+" You Have Fungal infections\n" +
"Fungal infections\n" +
"\n" +
"Fungi on the skin can cause a red, sore, or itchy rash. Candida is a common fungal infection that can appear under the breasts and in other skin folds.");}
           if (mediumpit.isSelected()) {textpitting.setText(namea+" You Have Breast abscess\n" +
"Breast abscess\n" +
"\n" +
"This is an infection caused by bacteria that get inside the breast, usually through the nipple. Abscesses often affect breast-feeding women, who may get cracked or irritated nipples.\n" +
"\n" +
"Breast abscesses can also affect women who are not breast-feeding if their breast skin is cracked or injured, or they have undergone a nipple piercing.\n" +
"\n" +
"Symptoms often include a hot, red, or painful lump that is filled with pus. Treatment usually includes draining the abscess and antibiotics.");}
           if (highpit.isSelected()) {textpitting.setText(namea+" You Have Mammary duct ectasia\n" +
"Mammary duct ectasia\n" +
"\n" +
"Most common in women over age 50, mammary duct ectasia occurs when a milk duct's walls thicken and get wider, which can lead to a buildup of fluid.\n" +
"\n" +
"Mammary duct ectasia may cause a thick, green or black discharge from the nipple, as well as redness, pain, or nipple changes. It may go away on its own or have to be treated with antibiotics.");}
        submit(textpitting.getText());   refreshtable();   }
     @FXML
     private void dischargelevel(ActionEvent event)  {
         if (lowdis.isSelected()) {textdischarge.setText(namea+" You Have Milky discharge:\n" +
"Milky discharge:\n" +
"\n" +
"This is the most common type of nipple discharge. In women, this can be because the woman has recently stopped breast-feeding or due to hormonal shifts in a premenopausal woman.");} 
          if (mediumdis.isSelected()) {textdischarge.setText(namea+"You Have Clear discharge: \n" +
"Clear discharge: \n" +

"Clear discharge from one breast only can be a symptom of breast cancer. Clear discharge from both breasts is usually less concerning, but if a woman is concerned, she should visit her doctor.\n" +
"" +
"\n ");}
           if (highdis.isSelected()) {textdischarge.setText(namea+" You Have Bloody discharge:\n" +
"Bloody discharge:\n" +
"\n" +
"Blood discharge can be caused by a non-cancerous tumor called a papilloma, which can irritate the tissue inside a breast duct. In rare instances, bloody discharge can be due to breast cancer.");}
         submit(textdischarge.getText());    refreshtable();  } 
     
     
     
     @FXML
     private void rashlevel(ActionEvent event)  {
         if (lowrash.isSelected()) {textrash.setText(namea+" You Have Inflammatory breast cancer\n" +
                 "Inflammatory breast cancer\n" +

"Inflammatory breast cancer (IBC) is an aggressive breast cancer that develops when cancer cells get into lymph vessels draining the skin of the breast. When the vessels become blocked by cancer cells, symptoms begin to appear. These include:\n" +
"\n" +
"Thickened skin\n" +
"Rash or irritation that resembles an infection\n" +
"Red, swollen and warm breast\n" +
"Pitted skin on the breast, similar to that of an orange peel\n" +
"\n" +
"Asthma is a condition in which the airways narrow and swell and produce extra mucus. This can cause shortness of breath, wheezing, tightness in the chest, and a nonproductive cough."); submit(textrash.getText());refreshtable(); }
   if (mediumrash.isSelected()) {textrash.setText(namea+" You Have Mastitis\n" +
           " Mastitis\n" +

"Mastitis is a painful swelling of the breast that occurs most often in breastfeeding women, usually within three months of giving birth. An infection occurs when milk builds up inside the breast due to a clogged duct or some other factor that slows or prevents the flow of milk. This can also happen when breaks in the skin of the nipple allow bacteria to enter. Symptoms develop quickly and include:\n" +
"\n" +
"Swelling of the breast\n" +
"Increased blood flow\n" +
"Pain\n" +
"Red skin\n" +
"Skin that is warm to the touch\n" +
"Fever\n" +
"Headache\n" +
"Nipple discharge\n" +
"Flu-like symptoms\n" +
"It is also possible for non-breastfeeding women to experience mastitis, usually as a result of a cracked or sore nipple, or a nipple piercing allowing bacteria to get into the milk duct.");}
   if (highrash.isSelected()) {textrash.setText(namea+" You Have Paget’s disease of the breast\n" +
           "Paget’s disease of the breast\n" +

"Paget’s disease of the breast is a rare form of breast cancer (1 to 4 percent of all cases of breast cancer) that involves the skin of the nipple and can extend onto the areola (the dark-colored skin around the nipple). Most people with this disease also have one or more tumors in the same breast, the most common tumors being either ductal carcinoma in situ or invasive breast cancer.\n" +
"\n" +
"In Paget’s disease of the breast, cancerous cells are found in the top layer of the skin of the nipple and areola. Such cells are identified when looked at under a microscope following tissue biopsy. It is not yet certain whether cancer cells from tumors inside the breast travel through the milk duct and deposit on the nipple, or whether cancer can develop separately in just the nipple.\n" +
"\n" +
"Symptoms of the disease include:\n" +
"\n" +
"Itching, tingling, or redness in the nipple area\n" +
"Flaky, crusty, or thickened skin (resembling eczema)\n" +
"A flattened nipple\n" +
"Yellow or bloody leakage from the skin of the nipple");}
     submit(textrash.getText());    refreshtable();    }
      @FXML
     private void changeevel(ActionEvent event)  {
         if (lowchange .isSelected()) {textchange.setText(namea+" You need to go for Asymmetry test\n" +
                  "here Your breasts are only evaluated using one projection. These images aren’t reliable because they are one-dimensional. Overlapping dense structures in the breast could be difficult to see. If your doctor finds a lesion or abnormality, they’ll call for another three-dimensional imaging test.");}
               if (mediumchange.isSelected()) {textchange.setText(namea+" You need to go for a Global  Asymmetry test\n" +
                       "here This finding shows there’s more volume or density in one breast than the other. Global asymmetry findings are normally the result of hormonal changes and normal variation. If a mass is found, your doctor will request additional imaging.");}
        if (highchange.isSelected()) {textchange.setText(namea+" You need to go for a Focal   Asymmetry test\n" +
                " here These images show a density on two mammographic views, but your doctor can’t fully tell if it’s a true mass. They’ll request further imaging and evaluation to rule out cancerous or abnormal masses.");}
           submit(textchange.getText());   refreshtable();   }
   
      @FXML
     private void pain(ActionEvent event)  {
  if(pain1.isSelected()){position=3;System.out.println("id added = "+position);}
     } 
     @FXML
     private void pit(ActionEvent event)  {
   if(pitting1.isSelected()){position=4;System.out.println("id added = "+position);}
    } @FXML
     private void disch(ActionEvent event)  {
    if(discharge1.isSelected()){position=5;System.out.println("id added = "+position);}
  } @FXML
     private void rash(ActionEvent event)  {
    if(rash1.isSelected()){position=6;System.out.println("id added = "+position);}
     } @FXML
     private void change(ActionEvent event)  {
   if(change1.isSelected()){position=7;System.out.println("id added = "+position);}
   }
     
     
     @FXML
     private void getsymptms(ActionEvent event)  {
        tabpaneeeee.getSelectionModel().select(tsymptoms);
            
            } 
     @FXML
     private void getpit(ActionEvent event)  {
         tabpaneeeee.getSelectionModel().select(tpitting);
            
              } 
     @FXML
     private void getrash(ActionEvent event)  {
        tabpaneeeee.getSelectionModel().select(trash);
            
              } 
     @FXML
     private void getdis(ActionEvent event)  {
        tabpaneeeee.getSelectionModel().select(tdischarge);
            
            } 
     @FXML
     private void getchange(ActionEvent event)  {
               tabpaneeeee.getSelectionModel().select(tchange);
     
       
           // tabpaneeeee.getSelectionModel().select((Tab) tabuu);
 
         }   
      
 
     @FXML
     private void next(ActionEvent event)  {
         
    tabpaneeeee.getSelectionModel().select(tsymptoms);  // TODO
       }
     @FXML
     private void previos(ActionEvent event)  {
    tabpaneeeee.getSelectionModel().select(tdash);  // TODO
       }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     @FXML
    void viewpatientdetai1(ActionEvent event) { 
tabpaneeeee.getSelectionModel().select(tpatients11);
    }
    
     @FXML
    void viewpatientdetai(ActionEvent event) { 
tabpaneeeee.getSelectionModel().select(tpatients1);
    }
     @FXML
    void viewdiagnses(ActionEvent event) { 
tabpaneeeee.getSelectionModel().select(tsymptoms);
    }
    
    
    @FXML
    void viewdash(ActionEvent event) { 
        getcount();
tabpaneeeee.getSelectionModel().select(tdash);

    }
 private void barview(){
      if (user.equalsIgnoreCase("Admin")){
        ca=new CategoryAxis();
      na=new NumberAxis();
       
          
                  ca.setLabel("Statistical No Of Records ");
        
         
        na.setLabel("Diagnoisis of Breast Cancer  Progressions");
        bar.setTitle("Admins Diagnsis Statistics");
        
          XYChart.Series<String,Number> feb=new XYChart.Series<>();
        XYChart.Series<String,Number> march=new XYChart.Series<>();
       XYChart.Series<String,Number> april=new XYChart.Series<>();
         feb.setName("Total No Of  Patients");
        march.setName("Total No Of Diagnosis");
          april.setName("Total No Of Symptomps");
      
           feb.getData().add(new XYChart.Data<>("Total No Of  Patients",cunt));
           march .getData().add(new XYChart.Data<>("Total No Of Diagnosis",15));
       april.getData().add(new XYChart.Data<>("Total No Of Symptomps",5));
                bar.getData().addAll(feb,march,april);
      }


else{
        ca=new CategoryAxis();
      na=new NumberAxis();
       
          
                  ca.setLabel("Statistical No Of Records ");
        
         
        na.setLabel(""+namea+" Diagnosis of Breast Cancer  Progressions");
        bar.setTitle(""+namea+" Diagnosis Statistics");
        
          XYChart.Series<String,Number> feb=new XYChart.Series<>();
          XYChart.Series<String,Number> april=new XYChart.Series<>();
         feb.setName(""+namea+ "  No Of Recorded Diagnosis");
      
          april.setName("Total No Of Symptoms");
      
           feb.getData().add(new XYChart.Data<>(""+namea+ "  No Of Recorded Diagnosis",cunt1));
     
       april.getData().add(new XYChart.Data<>("Total No Of Symptomps",5));
                bar.getData().addAll(feb,april);
      }
 }
 
 
 
  
     void getcount() 
           
     {
      if(user.equalsIgnoreCase("Admin")){  ResultSet rs;
            try {
                
                
                   rs = con.createStatement().executeQuery("select count(name) from USERS");
         
        while (rs.next()){
            System.out.println("abina PROBS  "); 
  
            
                   cunt=Integer.parseInt(rs.getString("count(name)"));
          } }catch(SQLException se){
System.out.println("DATA PROBS  "+se.getMessage()); 
        System.out.println("DATA PROBS  "+se.getSQLState()); 
        System.out.println("DATA PROBS  "+se.getCause()); 
  
        
       }
        }else{  ResultSet rs;
            try {
                
                
                   rs = con.createStatement().executeQuery("select count(diagnosis) from USERS WHERE username='"+ username+"'"); 
         
        while (rs.next()){
            System.out.println("abina PROBS  "); 
  
            
                   cunt1=Integer.parseInt(rs.getString("count(diagnosis)"));
          } }catch(SQLException se){
System.out.println("DATA PROBS  "+se.getMessage()); 
        System.out.println("DATA PROBS  "+se.getSQLState()); 
        System.out.println("DATA PROBS  "+se.getCause()); 
  
        
       }
        }
        
       
     
     
     
     }
 
 
 
 
 int cunt,cunt1;
 
 
 
 
 
   @FXML
    private void search( KeyEvent event)  {
  
    
   
        String g="%";
          datadmin=FXCollections.observableArrayList();
        ResultSet rs;
            try {
                
                
                   rs = con.createStatement().executeQuery("select * from USERS where name like '"+search.getText()+g+"'");
         
        while (rs.next()){
                  datadmin.add(new USERS(rs.getString(1),rs.getString(3),rs.getString(4)));
        } }catch(SQLException se){
 System.out.println("DATA PROBS  "+se.getMessage()); 
        System.out.println("DATA PROBS  "+se.getSQLState()); 
        System.out.println("DATA PROBS  "+se.getCause()); 
        }
 //  String NAME,String SEAT,String MATCH,String TICKET,String DATE) {
              
          cname.setCellValueFactory(new PropertyValueFactory<>("NAME"));
                      cdate.setCellValueFactory(new PropertyValueFactory<>("date"));
       
                
         type.setItems(null);
     type.setItems(datadmin);
      
       
         
   
        
             }
   
    
 
   
     @FXML
    private void search1( KeyEvent event)  {
  
    
   
        String g="%";
          datauser=FXCollections.observableArrayList();
        ResultSet rs;
            try {
                
                
                   rs = con.createStatement().executeQuery("select * from USERS where date like '"+search1.getText()+g+"'");
         
        while (rs.next()){
                  datauser.add(new USERS1(rs.getString(3),rs.getString(4)));
        } }catch(SQLException se){
 System.out.println("DATA PROBS  "+se.getMessage()); 
        System.out.println("DATA PROBS  "+se.getSQLState()); 
        System.out.println("DATA PROBS  "+se.getCause()); 
        }
 //  String NAME,String SEAT,String MATCH,String TICKET,String DATE) {
              
                     cdate1.setCellValueFactory(new PropertyValueFactory<>("date"));
       
                
         type1.setItems(null);
     type1.setItems(datauser);
      
       
         
   
        
             }
   
    
    
     private void refreshtable()  {
if(user.equalsIgnoreCase("admin")){
   try{
    
        datadmin=FXCollections.observableArrayList();
        
               ResultSet rs=con.createStatement().executeQuery("select * from USERS");
                  while (rs.next()){
                  datadmin.add(new USERS(rs.getString(1),rs.getString(3),rs.getString(4)));
        } }catch(SQLException se){
 System.out.println("DATA PROBS  "+se.getMessage()); 
        System.out.println("DATA PROBS  "+se.getSQLState()); 
        System.out.println("DATA PROBS  "+se.getCause()); 
        }
 //  String NAME,String SEAT,String MATCH,String TICKET,String DATE) {
              
          cname.setCellValueFactory(new PropertyValueFactory<>("NAME"));
                       cdate.setCellValueFactory(new PropertyValueFactory<>("date"));
       
                
         type.setItems(null);
     type.setItems(datadmin);
       
         
      
}else{try{
    
        datauser=FXCollections.observableArrayList();
      
               ResultSet rs=con.createStatement().executeQuery("select diagnosis,date from USERS where username='"+username +"' AND name='"+name +"'  ");
                  while (rs.next()){
                  datauser.add(new USERS1(rs.getString(1),rs.getString(2)));
        } }catch(SQLException se){
 System.out.println("DATA PROBS  "+se.getMessage()); 
        System.out.println("DATA PROBS  "+se.getSQLState()); 
        System.out.println("DATA PROBS  "+se.getCause()); 
        }
 //  String NAME,String SEAT,String MATCH,String TICKET,String DATE) {
              
                       cdate1.setCellValueFactory(new PropertyValueFactory<>("date"));
       
                
         type1.setItems(null);
     type1.setItems(datauser);
       }
       
   
   }
      
   @FXML
    private void logout(ActionEvent event) throws IOException {Stage stage;
    Stage stage1 = (Stage) loggeduser.getScene().getWindow();
                 Parent root = null;
                          try {
                                System.out.println("passed");
                              root = FXMLLoader.load(getClass().getResource("/fxmls/login.fxml"));
                            System.out.println("passed1");
                          } catch (IOException ex) {
                              System.out.println("errrr "+ex.getMessage());
                             }
                    
                    stage = new Stage();
                  
                  Scene scene = new Scene(root);
                  stage.setScene(scene);
                  
                   stage.initStyle(StageStyle.UNDECORATED);
              stage.centerOnScreen();
              stage1.close();
//              root.setOnMousePressed((MouseEvent event) -> {
//              xoffset=event.getSceneX();
//              yoffset= event.getSceneY();
//              });           root.setOnMouseDragged((MouseEvent event) -> {
//              stage.setX(event.getScreenX()-xoffset);
//              stage.setY(event.getScreenY()-yoffset);
//              }); 
                  
                  
                  
                          // stage.centerOnScreen();
                    //scene.getStylesheets().add(STUDENT_PROJECT_MANAGEMENTSYS.class.getResource("sign_up.css").toExternalForm());
                        
         
                        
                        
                    stage.showAndWait();
                    
                  
                //  stage.showAndWait();
                    
                 }
   
      
 
 
 
 
 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
   
      
    }  
    String username;String password;
    public String my_user(String logged,String username,String password){
   // lab.getText();
     user= logged;
    this. username=username;
        this. password=password;
        System.out.println("mmm "+user);
        if(user.equalsIgnoreCase("Admin")){
            loggeduser.setText("Admins Mode");
            user_dash.toBack();
        admin_dash.toFront();
        
        
        }else{ 
                      loggeduser.setText("Users Mode");
            admin_dash.toBack();user_dash.toFront();}
        
        
        
         DB_manager db=new DB_manager();
        try {
          con=  db.connect();
             db.create_tables();   logged_user();  refreshtable();getcount(); barview();getcount();
            // TODO
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DashController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    return user;
    } 
   String user ;
   
   
   
   
    private void logged_user(){
     try {
         String admin="Admin";
        stmt = con.createStatement();
             System.out.println("1");
        String sql="SELECT name,date FROM login1 where username='"+username +"' AND password='"+password +"' ";
        ResultSet rst=stmt.executeQuery(sql);
         System.out.println("2");
        while(rst.next()){
            
             System.out.println("3");
             namea=rst.getString(1);
             name=rst.getString(1);
        name1.setText("Name: "+rst.getString(1));
             date1.setText("created on: "+rst.getString(2));
        
                
        }
     }catch(SQLException e){
     
     
     }
           
   
   
   
   
   
   }
    String name;
    private void submit(String diagnosis){
 
     String sql="INSERT INTO USERS (name,username,diagnosis,date) VALUES (?,?,?,?) ";
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
         pst.setString(1, namea);
          pst.setString(2, username);
             pst.setString(3,  diagnosis);
  
          
           pst.setString(4, c);
          
 
          pst.executeUpdate();
              System.out.println("diagnsis saved sucessfully ");
               
      
    } catch (SQLException ex) {
   
                Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Signup Error");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText( "unable to sign up"+ex.getMessage());
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();
             }
    
    
    
    }
      
     @FXML
    private void delete( ActionEvent event)     {

  try {
                  stmt=(Statement)con.createStatement();
            String insertF="DELETE FROM USERS WHERE date='"+ del_date+"' AND username='"+ username+"'";
           
             
           
            
            stmt.executeUpdate( insertF);
            viewdiagnosis1.setText("");
            refreshtable();
         Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Delete");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText(" Deleted Successfully");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();  viewdiagnosis.setText(""); 
            // TODO add your handling code here:
        } catch (SQLException ex) {
           Alert loginerror1 = new Alert(Alert.AlertType.ERROR);
                loginerror1.setTitle("Delete");
                loginerror1.setHeaderText(null);
                loginerror1.setContentText("Records Not Deleted ");
                loginerror1.initModality(Modality.APPLICATION_MODAL);
                loginerror1.showAndWait();      
        }  }

      @FXML
    private void selecteduser( MouseEvent event)     {


  TableView.TableViewSelectionModel<USERS1> tvSelContact = 
                type1.getSelectionModel() 
          ;
  
    tvSelContact.selectedIndexProperty().addListener(new ChangeListener<Number>()
        {
        
        
          public void changed(ObservableValue<? extends Number> changed, 
                    Number oldVal, Number newVal) {
                int index = (int)newVal;
                viewdiagnosis.setText(datauser.get(index).getDIAGNOSIS());
               
                 
                 
                 
                }});
                
                
               }
  
  
    
    String del_date;
    
      @FXML
    private void selecteduser1( MouseEvent event)     {


  TableView.TableViewSelectionModel<USERS> tvSelContact = 
                type.getSelectionModel() 
          ;
  
    tvSelContact.selectedIndexProperty().addListener(new ChangeListener<Number>()
        {
        
        
          public void changed(ObservableValue<? extends Number> changed, 
                    Number oldVal, Number newVal) {
                int index = (int)newVal;
                viewdiagnosis1.setText(datadmin.get(index).getDIAGNOSIS());
                  
                 del_date=datadmin.get(index).getdate();
                 
                }});
                
                
               }
  
  
    
    
    
}
