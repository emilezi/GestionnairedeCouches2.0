/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author emilezimmer
 */
public class Statistics {
    
    public static int[] getNumberdiapers(){
        
        String[][] data_order = Order.getOrder();
        String[][] data_exit = Exit.getExit();
        int[] statistics = {0,0,0,0,0,0,0};
        
        int i = 0;
        int j = 0;
        
        for (String[] tab: data_order) {
            
            statistics[0] = statistics[0] + Integer.parseInt(data_order[i][1]);
            
            if(data_order[i][2].equals("3 ")){
                statistics[1] = statistics[1] + Integer.parseInt(data_order[i][1]);
            }else if(data_order[i][2].equals("4 ")){
                statistics[2] = statistics[2] + Integer.parseInt(data_order[i][1]);
            }else if(data_order[i][2].equals("4+")){
                statistics[3] = statistics[3] + Integer.parseInt(data_order[i][1]);
            }else if(data_order[i][2].equals("5 ")){
                statistics[4] = statistics[4] + Integer.parseInt(data_order[i][1]);
            }else if(data_order[i][2].equals("6 ")){
                statistics[5] = statistics[5] + Integer.parseInt(data_order[i][1]);
            }else if(data_order[i][2].equals("7 ")){
                statistics[6] = statistics[6] + Integer.parseInt(data_order[i][1]);
            }
            
            i++;
        }
        
        for (String[] tab: data_exit) {
            
            statistics[0] = statistics[0] - Integer.parseInt(data_exit[j][2]);
            
            if(data_exit[j][3].equals("3 ")){
                statistics[1] = statistics[1] - Integer.parseInt(data_exit[j][2]);
            }else if(data_exit[j][3].equals("4 ")){
                statistics[2] = statistics[2] - Integer.parseInt(data_exit[j][2]);
            }else if(data_exit[j][3].equals("4+")){
                statistics[3] = statistics[3] - Integer.parseInt(data_exit[j][2]);
            }else if(data_exit[j][3].equals("5 ")){
                statistics[4] = statistics[4] - Integer.parseInt(data_exit[j][2]);
            }else if(data_exit[j][3].equals("6 ")){
                statistics[5] = statistics[5] - Integer.parseInt(data_exit[j][2]);
            }else if(data_exit[j][3].equals("7 ")){
                statistics[6] = statistics[6] - Integer.parseInt(data_exit[j][2]);
            }
            
            j++;
        }
        
        return statistics;
        
    }
    
}
