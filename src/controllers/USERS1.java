/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author EBUKA
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author EBUKA
 */
public class USERS1 {
     
 private final StringProperty DIAGNOSIS; 
  
    
  private final StringProperty date; 
 
 
    public USERS1( String DIAGNOSIS,String date) {
              
                
                 this.DIAGNOSIS=new SimpleStringProperty(DIAGNOSIS);
                 
         this.date=new SimpleStringProperty(date);
        
                    
                      
                
             }
 
  
  
  public String getDIAGNOSIS() {
        return DIAGNOSIS.get();
    } 
        public String getdate() {
        return date.get();
    }
    
       public StringProperty DIAGNOSISProperty()
    {return DIAGNOSIS;}
         
         public StringProperty dateProperty()
    {return date;}
       
    
         
    
}
