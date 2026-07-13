/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author emilezimmer
 */
public class Form {
    
    public static int checkEntrance(String[] input){
        
        if(input[0].isEmpty()==true
                ||
                input[1].isEmpty()==true
                ||
                input[2].isEmpty()==true
                ||
                input[3].isEmpty() == true
                ||
                input[4].isEmpty() == true
                ||
                input[5].isEmpty() == true
                ){
            return 1;
        }else{
            return 0;
        }
        
    }
    
    public static int checkExit(String[] input){
        
        if(input[0].isEmpty()==true
                ||
                input[1].isEmpty()==true
                ||
                input[2].isEmpty()==true
                ){
            return 1;
        }else{
            return 0;
        }
        
    }
    
}
