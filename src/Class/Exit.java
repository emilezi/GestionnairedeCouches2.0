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
public class Exit {
    
    private static final String DELIMITER = ",";
    
    public static String[][] getExit(){
        
        String[][] exit = null;
        
        try{
            File file = new File("exit.txt");
            
            FileReader fr1 = new FileReader(file);
            FileReader fr2 = new FileReader(file); 
            BufferedReader br1 = new BufferedReader(fr1); 
            BufferedReader br2 = new BufferedReader(fr2); 
            String line;
            
            int i = 0;
            int k = 0;
            
            while((br1.readLine()) != null)
            {
                
                k++;
               
            }
            
            exit = new String[k][5]; 
            
            while((line = br2.readLine()) != null)
            {
                
                String[] resultat = line.split(DELIMITER);
            
                int j = 0;

                for (String value : resultat) {
                    exit[i][j] = value;
                    j++;
                }

                i++;
               
            }
            fr1.close();
            fr2.close();

        }catch(Exception e){
            System.out.println(e);
        }
        return exit;
    }
    
    public static void newExit(String[] Input)
    {
        
      String[][] data = Exit.getExit();
      
      try
      (final BufferedWriter writer = Files.newBufferedWriter(Paths.get("exit.txt"))){
        
        int i = 0;
        
        for (String[] tab: data) {
            writer.write(i+DELIMITER+data[i][1]+DELIMITER+data[i][2]+DELIMITER+data[i][3]+DELIMITER+data[i][4]);
            writer.newLine();
            i++;
        }  
        
        writer.write(i+DELIMITER+Input[0]+DELIMITER+Input[1]+DELIMITER+Input[2]+DELIMITER+Input[3]);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
        
    }
    
    public static void deleteExit(String id)
    {
        
        String[][] data_input = Exit.getExit();
        String[][] data_output;
        
        int j = 0;
        int k = 0;
        
        for (int i = 0; i < data_input.length; i++)
            {
                if(data_input[i][0].equals(id))
                {
                    
                }else{
                    k++;
                }
            
            }
        
        data_output = new String[k][5];
        
        for (int i = 0; i < data_input.length; i++)
            {
                if(data_input[i][0].equals(id))
                {
                    
                    
                    
                }else{
                    data_output[j][0] = data_input[i][0];
                    data_output[j][1] = data_input[i][1];
                    data_output[j][2] = data_input[i][2];
                    data_output[j][3] = data_input[i][3];
                    data_output[j][4] = data_input[i][4];
                    j++;
                }
            
            }
        
        try
            (final BufferedWriter writer = Files.newBufferedWriter(Paths.get("exit.txt"))){

              int i = 0;

              for (String[] tab: data_output) {
                  writer.write(i+DELIMITER+data_output[i][1]+DELIMITER+data_output[i][2]+DELIMITER+data_output[i][3]+DELIMITER+data_output[i][4]);
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
