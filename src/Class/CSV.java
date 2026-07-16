/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author emilezimmer
 */
public class CSV {
    
    private static final String DELIMITER = ",";
    
    public static void exportEntranceCSV(String[] Input){
        
        String[][] data_input = Order.getOrder();
        String[][] data_output;
        
        if(Input[1].equals("Libellé")){
        
            int j = 0;
            int k = 0;

            for (int i = 0; i < data_input.length; i++)
                {
                    if(data_input[i][0].equals(Input[0]))
                    {
                        k++;
                    }

                }

            data_output = new String[k][6];

            for (int i = 0; i < data_input.length; i++)
                {
                    if(data_input[i][0].equals(Input[0]))
                    {
                        data_output[j][0] = data_input[i][0];
                        data_output[j][1] = data_input[i][1];
                        data_output[j][2] = data_input[i][2];
                        data_output[j][3] = data_input[i][3];
                        data_output[j][4] = data_input[i][4];
                        data_output[j][5] = data_input[i][5];
                        j++;
                    }

                }
            
        }else{
            
            int j = 0;
            int k = 0;

            for (int i = 0; i < data_input.length; i++)
                {
                    if(data_input[i][5].equals(Input[0]))
                    {
                        k++;
                    }

                }

            data_output = new String[k][6];

            for (int i = 0; i < data_input.length; i++)
                {
                    if(data_input[i][5].equals(Input[0]))
                    {
                        data_output[j][0] = data_input[i][0];
                        data_output[j][1] = data_input[i][1];
                        data_output[j][2] = data_input[i][2];
                        data_output[j][3] = data_input[i][3];
                        data_output[j][4] = data_input[i][4];
                        data_output[j][5] = data_input[i][5];
                        j++;
                    }

                }
            
        }
        
        try
            (final BufferedWriter writer = Files.newBufferedWriter(Paths.get(Input[2]+".csv"))){

            int i = 0;
              
            writer.write("Libellé"+DELIMITER+"Quantité"+DELIMITER+"Catégorie"+DELIMITER+"Prix"+DELIMITER+"N° de lot"+DELIMITER+"Date");
            writer.newLine();

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
    
    public static void exportExitCSV(String[] Input){
        String[][] data_input = Exit.getExit();
        String[][] data_output;
        
        if(Input[1].equals("Libellé")){
        
            int j = 0;
            int k = 0;

            for (int i = 0; i < data_input.length; i++)
                {
                    if(data_input[i][1].equals(Input[0]))
                    {
                        k++;
                    }

                }

            data_output = new String[k][5];

            for (int i = 0; i < data_input.length; i++)
                {
                    if(data_input[i][1].equals(Input[0]))
                    {
                        data_output[j][0] = data_input[i][0];
                        data_output[j][1] = data_input[i][1];
                        data_output[j][2] = data_input[i][2];
                        data_output[j][3] = data_input[i][3];
                        data_output[j][4] = data_input[i][4];
                        j++;
                    }

                }
            
        }else{
            
            int j = 0;
            int k = 0;

            for (int i = 0; i < data_input.length; i++)
                {
                    if(data_input[i][4].equals(Input[0]))
                    {
                        k++;
                    }

                }

            data_output = new String[k][5];

            for (int i = 0; i < data_input.length; i++)
                {
                    if(data_input[i][4].equals(Input[0]))
                    {
                        data_output[j][0] = data_input[i][0];
                        data_output[j][1] = data_input[i][1];
                        data_output[j][2] = data_input[i][2];
                        data_output[j][3] = data_input[i][3];
                        data_output[j][4] = data_input[i][4];
                        j++;
                    }

                }
            
        }
        
        try
            (final BufferedWriter writer = Files.newBufferedWriter(Paths.get(Input[2]+".csv"))){

            int i = 0;
              
            writer.write("Id"+DELIMITER+"Libellé"+DELIMITER+"Quantité"+DELIMITER+"Catégorie"+DELIMITER+"Date");
            writer.newLine();

              for (String[] tab: data_output) {
                  writer.write(data_output[i][0]+DELIMITER+data_output[i][1]+DELIMITER+data_output[i][2]+DELIMITER+data_output[i][3]+DELIMITER+data_output[i][4]);
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
