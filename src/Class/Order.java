/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author emilezimmer
 */
public class Order {
    
    private static final String DELIMITER = ",";
    
    public static String[][] getOrder(){
        
        String[][] order = null;
        
        try{
            File file = new File("data.txt");
            
            FileReader fr1 = new FileReader(file);
            FileReader fr2 = new FileReader(file); 
            BufferedReader br1 = new BufferedReader(fr1); 
            BufferedReader br2 = new BufferedReader(fr2); 
            String column;
            
            int i = 0;
            int k = 0;
            
            while((br1.readLine()) != null)
            {
                
                k++;
               
            }
            
            order = new String[k][6]; 
            
            while((column = br2.readLine()) != null)
            {
                
                String[] resultat = column.split(DELIMITER);
            
                int j = 0;

                for (String value : resultat) {
                    order[i][j] = value;
                    j++;
                }

                i++;
               
            }
            fr1.close();
            fr2.close();

        }catch(Exception e){
            System.out.println(e);
        }
        return order;
    }
    
    public static void newOrder(String[] Input)
    {
        
      String[][] data = Order.getOrder();
      
      try
      (final BufferedWriter writer = Files.newBufferedWriter(Paths.get("data.txt"))){
        
        int i = 0;
        
        for (String[] tab: data) {
            writer.write(data[i][0]+DELIMITER+data[i][1]+DELIMITER+data[i][2]+DELIMITER+data[i][3]+DELIMITER+data[i][4]+DELIMITER+data[i][5]);
            writer.newLine();
            i++;
        }  
        
        writer.write(Input[0]+DELIMITER+Input[1]+DELIMITER+Input[2]+DELIMITER+Input[3]+DELIMITER+Input[4]+DELIMITER+Input[5]);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
        
    }
    
    public static void deleteOrder(String lot)
    {
        
        String[][] data_input = Order.getOrder();
        String[][] data_output;
        
        int j = 0;
        int k = 0;
        
        for (int i = 0; i < data_input.length; i++)
            {
                if(data_input[i][4].equals(lot))
                {
                    
                }else{
                    k++;
                }
            
            }
        
        data_output = new String[k][6];
        
        for (int i = 0; i < data_input.length; i++)
            {
                if(data_input[i][4].equals(lot))
                {
                    
                }else{
                    data_output[j][0] = data_input[i][0];
                    data_output[j][1] = data_input[i][1];
                    data_output[j][2] = data_input[i][2];
                    data_output[j][3] = data_input[i][3];
                    data_output[j][4] = data_input[i][4];
                    data_output[j][5] = data_input[i][5];
                    j++;
                }
            
            }
        
        try
            (final BufferedWriter writer = Files.newBufferedWriter(Paths.get("data.txt"))){

              int i = 0;

              for (String[] tab: data_output) {
                  writer.write(data_output[i][0]+DELIMITER+data_output[i][1]+DELIMITER+data_output[i][2]+DELIMITER+data_output[i][3]+DELIMITER+data_output[i][4]+DELIMITER+data_output[i][5]);
                  writer.newLine();
                  i++;
              }  
            }
            catch(Exception e)
            {
              System.out.println(e);
            }
        
    }
    
}
