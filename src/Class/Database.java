/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.*;

/**
 *
 * @author emilezimmer
 */
public class Database {
    
    private static final String SEPARATOR = "\n";
    
    private static final String HEADER = "Libellé,Quantité,Catégorie,Prix,N° de lot,Date";
    
  
    public static int checkTXT()
    {
        int value = 0;
        
        File file = new File("data.txt"); 
        if(file.exists()){
          value = 0;
        }else{
          value = 1;
        }
        
        return value;
        
    }
    
    public static void newTXT()
    {
      
      FileWriter file = null;
      
      try
      {
        file = new FileWriter("data.txt");
      
        file.close();
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
        
    }
    
}
