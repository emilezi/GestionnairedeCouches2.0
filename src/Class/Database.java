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
        
        File file1 = new File("entrance.txt");
        File file2 = new File("exit.txt");
        if(file1.exists() && file2.exists()){
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
        file = new FileWriter("entrance.txt");
        file.close();
        file = new FileWriter("exit.txt");
        file.close();
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
        
    }
    
}
