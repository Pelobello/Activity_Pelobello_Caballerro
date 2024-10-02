/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_pelobello_caballero;

/**
 *
 * @author USER
 */
public class Activity_Pelobello_Caballero {

    
    public static void main(String[] args) {
      
        Calculator calculator = new Calculator();
        
        System.out.println(calculator.calculate(10, 2, 3,5));
        System.out.println("");
        mean Mean = new mean();
        double data[] = {1,2,3,4,5};
        Mean.mean(data);

        
    }
  
}
   class Calculator{
         public int calculate(int fnum,int snum,int tnum,int fonum){
        
        int total = fnum + snum -tnum;
       
        int totalthree = total/ fonum;
        return totalthree;
         }
      
         
    }
